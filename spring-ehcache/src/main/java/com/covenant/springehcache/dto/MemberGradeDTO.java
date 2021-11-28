package com.covenant.springehcache.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MemberGradeDTO {

    private final Long memberId;
    private final String grade;
}
