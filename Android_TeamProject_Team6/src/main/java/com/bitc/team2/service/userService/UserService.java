package com.bitc.team2.service.userService;

import com.bitc.team2.dto.UserDto;

public interface UserService {

	int loginCheck(String userId, String userPw) throws Exception;

	void userJoin(UserDto user) throws Exception;

	

}
