package com.covenant.onetomany.service;

import com.covenant.onetomany.domain.Pocket;
import com.covenant.onetomany.domain.Stone;
import com.covenant.onetomany.dto.PocketDTO;
import com.covenant.onetomany.dto.StoneDTO;
import com.covenant.onetomany.repository.PocketRepository;
import com.covenant.onetomany.repository.StoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PocketService {

    private final PocketRepository pocketRepository;

    public void createPocketAndStones(PocketDTO pocketDTO) {
        Pocket pocket = Pocket.createPocket(pocketDTO.getPocketName(), pocketDTO.getPocketColor());
        List<StoneDTO> stones = pocketDTO.getStones();
        for (StoneDTO stoneDTO : stones) {
            Stone stone = Stone.createStone(stoneDTO.getStoneName(), pocket);
            pocket.putStone(stone);
        }
        pocketRepository.save(pocket);
    }

    public void createPocketAndStonesV2(PocketDTO pocketDTO) {
        Pocket pocket = Pocket.createPocket(pocketDTO.getPocketName(), pocketDTO.getPocketColor());
        List<StoneDTO> stones = pocketDTO.getStones();
        stones.forEach(stone -> pocket.putStone(
                Stone.createStone(stone.getStoneName(), pocket)
        ));

        pocketRepository.save(pocket);
    }
}
