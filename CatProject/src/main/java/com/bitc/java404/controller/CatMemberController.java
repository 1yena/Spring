package com.bitc.java404.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitc.java404.dto.CatMemberDto;
import com.bitc.java404.service.CatMemberService;


@Controller
public class CatMemberController {
	
	@Autowired
	private CatMemberService catService;
	
//	사용자가 로그인하기 위해 보는 페이지
	@RequestMapping(value="/cat/login", method=RequestMethod.GET)
	public String login() throws Exception {
		return "/login/login";
	}
	
//	사용자 입력정보를 바탕으로 DB에서 사용자 정보가 있는지 확인하는 페이지
	@RequestMapping(value="/cat/loginCheck", method=RequestMethod.POST)
	public String loginCheck(CatMemberDto member, HttpServletRequest request) throws Exception {

		int count = catService.selectMemberInfoYn(member.getUserId(), member.getUserPw());
		
		if (count == 1) {
			HttpSession session = request.getSession();
			session.setAttribute("userId", member.getUserId());
			session.setMaxInactiveInterval(600);
			
//			로그인 이후에 접속할 수 있는 페이지로 이동
			return "redirect:/cat/loginOK";
		}
		else {
//			로그인 실패 시 오류 페이지로 이동
			return "redirect:/cat/loginFail";
		}
	}
	
//	로그인 시에만 접속할 수 있는 페이지
	@RequestMapping(value="/cat/loginOK", method=RequestMethod.GET)
	public String loginOK(HttpServletRequest request) throws Exception {

		return "/login/loginOK";
	}
	
	
//	로그인 실패 시 동작하는 페이지
	@RequestMapping(value="/cat/loginFail", method=RequestMethod.GET)
	public String loginFail() throws Exception {
		return "/login/loginFail";
	}
	
	
///////////////////////////////////////회원가입////////////////////////////////////////////

	
	@Autowired private CatMemberService memberservice;
	 
	@RequestMapping(value="/cat/joinMain")
	public String joinMain() throws Exception {
		return "/join/joinMain";
	}
	
	@RequestMapping(value="/cat/joinMember")
	public String joinMember(CatMemberDto member) throws Exception {
		memberservice.joinMain(member);
		
		return "redirect:/cat/joinOk";
	}
	
	
//	회원가입 완료 시에만 접속할 수 있는 페이지
	@RequestMapping(value="/cat/joinOk")
	public String joinOK() throws Exception {
		
		return "/join/joinOK";
		
	}
	

}
