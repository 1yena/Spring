package com.bitc.team2.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.bitc.team2.dto.UserDto;

@Mapper
public interface UserMapper {

	int loginCheck(@Param("userId")String userId, @Param("userPw")String userPw) throws Exception;

	void userJoin(UserDto user) throws Exception;

}
