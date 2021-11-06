package com.tistory.covenant.service;

import com.tistory.covenant.repository.MemberRepository;
import com.tistory.covenant.vo.MemberVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void saveMember(MemberVO memberVO) {
        memberRepository.saveMember(memberVO);
    }

    public List<MemberVO> searchMemberV1(String username, String nickname) {
        return memberRepository.getMemberV1(username, nickname);
    }

    public List<MemberVO> searchMemberV2(String username, String nickname) {
        return memberRepository.getMemberV2(username, nickname);
    }

    public List<MemberVO> searchMemberV3(String username, String nickname) {
        return memberRepository.getMemberV3(username, nickname);
    }

    public List<MemberVO> searchMemberV4(String username, String nickname) {
        return memberRepository.getMemberV4(username, nickname);
    }
}
