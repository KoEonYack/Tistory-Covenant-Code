package com.tistory.covenant.repository;

import com.tistory.covenant.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemberRepository {

    void saveMember(MemberVO memberVO);
    List<MemberVO> getMemberV1(@Param("username") String username, @Param("nickname") String nickname);
    List<MemberVO> getMemberV2(@Param("username") String username, @Param("nickname") String nickname);
}
