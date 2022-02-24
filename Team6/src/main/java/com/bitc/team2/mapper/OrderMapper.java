package com.bitc.team2.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.bitc.team2.dto.OrderDto;

@Mapper
public interface OrderMapper {

	void mapinsert(OrderDto order) throws Exception;

}
