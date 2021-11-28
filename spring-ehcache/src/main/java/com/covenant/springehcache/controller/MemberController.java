package com.covenant.springehcache.controller;

import com.covenant.springehcache.dto.MemberGradeDTO;
import com.covenant.springehcache.service.MemberGradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberGradeService memberGradeService;

    @GetMapping
    public MemberGradeDTO findAll() {
        return memberGradeService.getGrade();
    }
}
