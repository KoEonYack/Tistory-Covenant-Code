package com.tistory.covenant.service;

import com.tistory.covenant.vo.MemberVO;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Test
    @DisplayName("WHERE 1 = 1 조회")
    void searchMemberV1() {
        List<MemberVO> members = memberService.searchMemberV1(null, null);
        assertEquals(members.size(), 2);
    }

    @Test
    @DisplayName("Trim 조회")
    void searchMemberV2() {
        List<MemberVO> members = memberService.searchMemberV2(null, null);
        assertEquals(members.size(), 2);
    }

    @Test
    @DisplayName("Trim 조회 (2)")
    void searchMemberV3() {
        try{
            List<MemberVO> members = memberService.searchMemberV3(null, null);
            assertEquals(members.size(), 2);
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }

    }

    @Test
    @DisplayName("<where> 조회")
    void searchMemberV4() {
        List<MemberVO> members = memberService.searchMemberV4(null, null);
        assertEquals(members.size(), 2);
    }
}