package com.bitc.java404.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.bitc.java404.dto.CatMemberDto;

@Mapper
public interface CatMemberMapper {

	int selectMemberInfoYn(@Param("userId") String userId, @Param("userPw") String userPw) throws Exception;	// 멤버리스트
	
	public void insertMemberInfo(CatMemberDto member) throws Exception;	// 멤버 등록

	void joinMain(CatMemberDto member) throws Exception;
}
