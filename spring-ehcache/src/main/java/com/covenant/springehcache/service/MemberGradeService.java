package com.covenant.springehcache.service;

import com.covenant.springehcache.dto.MemberGradeDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MemberGradeService {

    @Cacheable("grade")
    public MemberGradeDTO getGrade() {
        log.info("Retrieving tasks");
        return new MemberGradeDTO(1L, "VIP");
    }
}
