package com.bitc.team2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitc.team2.dto.UserDto;
import com.bitc.team2.service.userService.UserService;



@Controller
public class AppController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String test() throws Exception{
		return "index";
	}
	@RequestMapping("/main")
	public String mainPage() throws Exception{
		return "main";
	}
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() throws Exception{
		return "user/login";
	}

	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	public String loginCheck(UserDto user, HttpServletRequest request) throws Exception {
		int count = userService.loginCheck(user.getUserId(), user.getUserPw());
		if (count == 1) {
			HttpSession session = request.getSession();
			session.setAttribute("userId", user.getUserId());
			session.setMaxInactiveInterval(30);
			// ?후에 메인페이지로 변경하기
			return "redirect:/main";
		} else {
			//
			return "redirect:/loginFail";
		}
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String userJoinPage() throws Exception {
		return "/user/join";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String userJoin(UserDto user) throws Exception {
		userService.userJoin(user);
		return "redirect:/login";
	}
	// 로그아웃
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		session.removeAttribute("userId");
		session.invalidate();

		return "/user/login";
	}
}
