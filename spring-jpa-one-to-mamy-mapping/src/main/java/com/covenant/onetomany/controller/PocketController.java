package com.covenant.onetomany.controller;

import com.covenant.onetomany.dto.PocketDTO;
import com.covenant.onetomany.service.PocketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PocketController {

    private final PocketService pocketService;

    @PostMapping("/pockets")
    public ResponseEntity<String> createPocketAndStones(@RequestBody PocketDTO pocketDTO) {
        pocketService.createPocketAndStones(pocketDTO);
        return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body("Pocket 생성 성공");
    }

}
