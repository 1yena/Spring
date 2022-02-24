package com.bitc.team2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitc.team2.dto.OrderDto;
import com.bitc.team2.mapper.OrderMapper;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderMapper orderMapper;


	@Override
	public void mapinsert(OrderDto order) throws Exception {
		orderMapper.mapinsert(order);
		
	}
	


}
