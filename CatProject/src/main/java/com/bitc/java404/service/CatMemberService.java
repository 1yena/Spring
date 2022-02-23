package com.bitc.java404.service;

import com.bitc.java404.dto.CatMemberDto;

public interface CatMemberService {

	int selectMemberInfoYn(String userId, String userPw) throws Exception;

	void joinMain(CatMemberDto member) throws Exception;
	
}
