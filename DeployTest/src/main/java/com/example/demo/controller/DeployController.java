package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeployController {

	@RequestMapping("/")
	public String index() throws Exception {
		return "index";
	}
	
	@RequestMapping("/test")
	public String test() throws Exception {
		return "test";
	}
}
