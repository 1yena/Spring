package com.bitc.team2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitc.team2.dto.OrderDto;
import com.bitc.team2.service.OrderService;


@Controller
public class AppController {
	
	@Autowired
	private OrderService orderService;
	
	///////////////////**********************주소 검색***************************//////////////////////////////
	@RequestMapping(value="/map")
	public String mapinsert() throws Exception {
		return "map";
	}
	
	@RequestMapping(value="/map/mapRegister") 
	 public String mapregister(OrderDto order) throws Exception {
		orderService.mapinsert(order);
	 return "redirect:"; 
	 }
	
	
	
	
	/*
	 * //주문하기 페이지로 ~~
	 * @RequestMapping(value="") 
	 * public ModelAndView productDetail(@RequestParam("seq") int seq) throws Exception { 
	 * 		ModelAndView mv = new ModelAndView("");
	 * 
	 * 		return mv; 
	 * }
	 */
	
	
	
	
	
	
	///////////////////**********************위치 찾기***************************//////////////////////////////
	@RequestMapping(value="/store")
	public String store() throws Exception {
		return "store";
	}
	
}
