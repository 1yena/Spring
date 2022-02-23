package com.bitc.csy.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

@Controller
public class AppServerController {

	@RequestMapping("/")
	public String index() throws Exception {
		return "index";
	}
	
	@RequestMapping(value="/app/rest/viewAjaxInfo", method=RequestMethod.GET)
	public String viewAjaxInfo() throws Exception {
		return "/app/rest/viewAjaxInfo";
	}
	
	@ResponseBody
	@RequestMapping(value="/app/rest/getAjaxInfo", method=RequestMethod.GET)
	public Object getAjaxInfo() throws Exception {
		
//		Map<String, String> resultData = new HashMap<String, String>();
//		
//		resultData.put("result", "success");
//		resultData.put("data", "ajax 테스트 데이터");
//		
//		return resultData;
		
////		Gson 기본 사용 방법
////		Gson 객체 생성
//		Gson gson = new Gson();
////		Gson에서 제공하는 JsonObject 클래스 타입의 객체 생성
//		JsonObject obj = new JsonObject();
////		addProperty를 통해서 JsonObject 클래스 타입의 객체에 데이터 추가
//		obj.addProperty("result", "success");
//		obj.addProperty("data", "ajax 테스트 데이터");
		
//		toJson(object) 을 사용하여 Java Object 데이터 타입을 json 타입의 문자열로 변경함
//		fromJson(json문자열, java클래스타입.class) 을 사용하여 매개변수인 json 타입의 문자열을 java Object 데이터 타입으로 변경함
//		return gson.toJson(obj);
		
		
		
//		HashMap 사용 시
		Map<String, String> resultData = new HashMap<String, String>();
		
		resultData.put("result", "success");
		resultData.put("data", "HashMap 방식 ajax 데이터");
		
		Gson gson = new Gson();
		
		return gson.toJson(resultData);
	}
	
}




