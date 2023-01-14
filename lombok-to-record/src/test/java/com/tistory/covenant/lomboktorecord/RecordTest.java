package com.tistory.covenant.lomboktorecord;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecordTest {


    @Test
    void createMemberTest() {
        Member member = new Member("john", "covenant");
        member = member.changeUsername("apple");

        System.out.println("member = " + member);
        // member = Member[username=apple, nickname=covenant]
        // member = Member(username=apple, nickname=covenant)

        assertEquals("apple", member.username());
        assertEquals(member, new Member("apple", "covenant"));
        assertEquals("covenant", member.nickname());
    }

    @Test
    void janeDoeTest() {
        Member member = new Member("john", "doe");
        System.out.println("member = " + member);
    }
}
