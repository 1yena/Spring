package com.bitc.java404.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitc.java404.dto.CatMemberDto;
import com.bitc.java404.mapper.CatMemberMapper;


@Service
public class CatMemberServiceImpl implements CatMemberService {
	
	@Autowired
	private CatMemberMapper catMapper;
	
	@Override
	public int selectMemberInfoYn(String userId, String userPw) throws Exception {
		return catMapper.selectMemberInfoYn(userId, userPw);
	}

	@Override
	public void joinMain(CatMemberDto member) throws Exception {
		catMapper.joinMain(member);
	}

}
