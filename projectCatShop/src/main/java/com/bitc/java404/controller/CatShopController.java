package com.bitc.java404.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bitc.java404.dto.ProductDto;
import com.bitc.java404.service.ProductService;


@Controller
public class CatShopController {
	
///////////////////////////////////////////////////////**  메인  **/////////////////////////////////////////////////////////////////////////
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/catshop")
	public ModelAndView catshop() throws Exception {
		ModelAndView mv = new ModelAndView("/main/main");
		
		//서비스를 이용해서 mapper를 통해 데이터 가져오기
		
		// mv에 addObject()
		
		List<ProductDto> hotList = productService.selectHotList();
		List<ProductDto> newList = productService.selectNewList();
		
		mv.addObject("hotList", hotList);
		mv.addObject("newList", newList);
		
		
		
		return mv;
	}
	
	
	
	///////////////////////////////////////////////////////**  메뉴  **/////////////////////////////////////////////////////////////////////////

	@RequestMapping(value="/catshop/menu")
	public String catshopMenu() throws Exception {
		return "/main/menu";
	}
	
	@RequestMapping(value="/catshop/fodder")
	public String catshopfodder() throws Exception {
		
		return "/main/menu-fodder";
	}
	
	@RequestMapping(value="/catshop/snack")
	public String catshopsnack() throws Exception {
		
		return "/main/menu-snack";
	}
	
	@RequestMapping(value="/catshop/sand")
	public String catshopsand() throws Exception {
		
		return "/main/menu-sand";
	}
	
	@RequestMapping(value="/catshop/toy")
	public String catshoptoy() throws Exception {
		
		return "/main/menu-toy";
	}
	
	@RequestMapping(value="/catshop/towel")
	public String catshoptowel() throws Exception {
		
		return "/main/menu-towel";
	}
	
	
	///////////////////////////////////////////////////////**  세부메뉴  **/////////////////////////////////////////////////////////////////////////
	
	

}
