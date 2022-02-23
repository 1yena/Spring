package com.bitc.java404.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bitc.java404.dto.CatProductDto;
import com.bitc.java404.service.CatProductService;


@Controller
public class CatBoardController {
	
	@Autowired
	private CatProductService productService;
	
	@RequestMapping(value="/cat/main")
	public String catmain() throws Exception {
		
		return "/main/main";
	}
	
	
	/////////////////////////////메뉴/////////////////////////////////////////////
	@RequestMapping(value="/cat/menu")
	public String catmenu() throws Exception {
		
		return "/main/menu";
	}
	
	@RequestMapping(value="/cat/fodder")
	public String catfodder() throws Exception {
		
		return "/main/menu-fodder";
	}
	
	@RequestMapping(value="/cat/snack")
	public String catsnack() throws Exception {
		
		return "/main/menu-snack";
	}
	
	@RequestMapping(value="/cat/sand")
	public String catsand() throws Exception {
		
		return "/main/menu-sand";
	}
	
	@RequestMapping(value="/cat/toy")
	public String cattoy() throws Exception {
		
		return "/main/menu-toy";
	}
	
	@RequestMapping(value="/cat/towel")
	public String cattowel() throws Exception {
		
		return "/main/menu-towel";
	}
	
	
	
	
	/////////////////////////////상품/////////////////////////////////////////////
	@RequestMapping(value="/cat/proinsert")
	public String proinsert() throws Exception {
		
		return "/product/insertpro";
	}
	
	
	@RequestMapping(value="/cat/proRegister")
	public String proregister(CatProductDto product) throws Exception {
		productService.proinsert(product);
		
		return "redirect:/cat/foodallages";
	}
	
	@RequestMapping(value="/cat/productdetail")
	public ModelAndView productDetail(@RequestParam("productSeq") int productSeq) throws Exception {
		ModelAndView mv = new ModelAndView("/catfodder/details/allagesPure");
		
		
		
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	////////////////////*************************************************************///////////////////////////////////////////////////////////////
	/////////////////////////////사료/////////////////////////////////////////////
	
	//전연령층
	@Autowired
	private CatProductService catProductService;
	
	@RequestMapping(value="/cat/foodallages")
	public ModelAndView foodallages() throws Exception {
		ModelAndView mv = new ModelAndView("/catfodder/allages");
		
		List<CatProductDto> productList = catProductService.selectProductList();
		
		mv.addObject("products", productList);
		
		return mv;
	}
	//자묘용
	@RequestMapping(value="/cat/foodkitten")
	public ModelAndView foodkitten() throws Exception {
		ModelAndView mv = new ModelAndView("/catfodder/kitten");
		
		List<CatProductDto> productList = catProductService.selectProductList();
		
		mv.addObject("products", productList);
		
		return mv;
	}
	//성묘용
	@RequestMapping(value="/cat/foodadult")
	public ModelAndView foodadult() throws Exception {
		ModelAndView mv = new ModelAndView("/catfodder/adult");
		
		List<CatProductDto> productList = catProductService.selectProductList();
		
		mv.addObject("products", productList);
		
		return mv;
	}
		
	/////////////////////////////간식/////////////////////////////////////////////
			
	//주식파우치
	@RequestMapping(value="/cat/snackstaple")
	public ModelAndView snackstaple() throws Exception {
		ModelAndView mv = new ModelAndView("/snack/staple");
		
		List<CatProductDto> productList = catProductService.selectProductList();
		
		mv.addObject("products", productList);
		
		return mv;
	}
	//간식파우치
	@RequestMapping(value="/cat/snackchur")
	public ModelAndView snackchur() throws Exception {
		ModelAndView mv = new ModelAndView("/snack/chur");
		
		List<CatProductDto> productList = catProductService.selectProductList();
		
		mv.addObject("products", productList);
		
		return mv;
	}
	//건조파우치
	@RequestMapping(value="/cat/snackdry")
	public ModelAndView snackdry() throws Exception {
		ModelAndView mv = new ModelAndView("/snack/dry");
		
		List<CatProductDto> productList = catProductService.selectProductList();
		
		mv.addObject("products", productList);
		
		return mv;
	}
	
	/////////////////////////////모래/////////////////////////////////////////////
		
	//응고형벤토
	@RequestMapping(value="/cat/sandclotbento")
	public ModelAndView sandclotbento() throws Exception {
		ModelAndView mv = new ModelAndView("/sand/clot-bento");
		
		List<CatProductDto> productList = catProductService.selectProductList();
		
		mv.addObject("products", productList);
		
		return mv;
	}
	//응고형천연
	@RequestMapping(value="/cat/sandclotnature")
	public ModelAndView sandclotnature() throws Exception {
		ModelAndView mv = new ModelAndView("/sand/clot-nature");
		
		List<CatProductDto> productList = catProductService.selectProductList();
		
		mv.addObject("products", productList);
		
		return mv;
	}
	//흡수형천연
	@RequestMapping(value="/cat/sandabsorbnature")
	public ModelAndView sandabsorbnature() throws Exception {
		ModelAndView mv = new ModelAndView("/sand/absorb-nature");
		
		List<CatProductDto> productList = catProductService.selectProductList();
		
		mv.addObject("products", productList);
		
		return mv;
	}
	
	/////////////////////////////장난감/////////////////////////////////////////////
	
	//낚시대
	@RequestMapping(value="/cat/toyfishing")
	public ModelAndView toyfishing() throws Exception {
		ModelAndView mv = new ModelAndView("/toy/fishing");
		
		List<CatProductDto> productList = catProductService.selectProductList();
		
		mv.addObject("products", productList);
		
		return mv;
	}
	//인형/쿠션
	@RequestMapping(value="/cat/toydoll")
	public ModelAndView toydoll() throws Exception {
		ModelAndView mv = new ModelAndView("/toy/doll");
		
		List<CatProductDto> productList = catProductService.selectProductList();
		
		mv.addObject("products", productList);
		
		return mv;
	}
	//움집
	@RequestMapping(value="/cat/toyhouse")
	public ModelAndView toyhouse() throws Exception {
		ModelAndView mv = new ModelAndView("/toy/house");
		
		List<CatProductDto> productList = catProductService.selectProductList();
		
		mv.addObject("products", productList);
		
		return mv;
	}
	
	/////////////////////////////캣타워/////////////////////////////////////////////
		
	//소형
	@RequestMapping(value="/cat/towersmall")
	public ModelAndView towersmall() throws Exception {
		ModelAndView mv = new ModelAndView("/tower/small");
		
		List<CatProductDto> productList = catProductService.selectProductList();
		
		mv.addObject("products", productList);
		
		return mv;
	}
	//중형
	@RequestMapping(value="/cat/towermiddle")
	public ModelAndView towermiddle() throws Exception {
		ModelAndView mv = new ModelAndView("/tower/middle");
		
		return mv;
	}
	//대형
	@RequestMapping(value="/cat/towerlarge")
	public ModelAndView towerlarge() throws Exception {
		ModelAndView mv = new ModelAndView("/tower/large");
		
		List<CatProductDto> productList = catProductService.selectProductList();
		
		mv.addObject("products", productList);
		
		return mv;
	}
	
	
	//************************************상세보기****************************************//
	
	
	//-------------------------------------사료------------------------------------------//
	
	//////////////////////////////////////전연령층//////////////////////////////////////////
		
		//퓨어비타
		@RequestMapping(value="/cat/allagesPure")
		public ModelAndView allagesPure() throws Exception {
			ModelAndView mv = new ModelAndView("/catfodder/details/allagesPure");
			
			return mv;
		}


}
