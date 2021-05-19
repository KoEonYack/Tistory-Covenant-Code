package com.covenant.springbootmysql.repository;

import com.covenant.springbootmysql.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}