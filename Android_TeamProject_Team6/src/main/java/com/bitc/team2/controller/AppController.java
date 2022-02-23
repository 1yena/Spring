package com.bitc.team2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AppController {
	
	@RequestMapping("/map")
	public String map() throws Exception {
		return "map";
	}
	
	@RequestMapping("/store")
	public String store() throws Exception {
		return "store";
	}
	
}
