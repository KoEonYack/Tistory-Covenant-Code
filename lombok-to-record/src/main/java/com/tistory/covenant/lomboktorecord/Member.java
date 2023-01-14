package com.tistory.covenant.lomboktorecord;

public record Member(String username, String nickname) {

    public Member changeUsername(String username) {
        return new Member(username, nickname);
    }
}