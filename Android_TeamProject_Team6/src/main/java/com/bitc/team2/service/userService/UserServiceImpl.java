package com.bitc.team2.service.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitc.team2.dto.UserDto;
import com.bitc.team2.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int loginCheck(String userId, String userPw) throws Exception {
		
		return userMapper.loginCheck(userId, userPw);
	}

	@Override
	public void userJoin(UserDto user) throws Exception {
		userMapper.userJoin(user);
	}



}
