package com.bitc.java404.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

//	@Bean
//	public CommonsMultipartResolver multipartResolver() {
////		apache의 Commons-io 및 Commons-fileupload를 사용하기 때문에 CommonsMultipartResolver를 통해서 MultipartResolver를 구현하고 스프링 프레임워크에 등록
//		CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
//		commonsMultipartResolver.setDefaultEncoding("UTF-8");
////		최대 업로드 가능 파일크기 설정
////		기본 단위가 byte임, 5 * 1024 * 1024 = 5MB
//		commonsMultipartResolver.setMaxUploadSizePerFile(5 * 1024 * 1024);
//		
//		return commonsMultipartResolver;
//	}
	
	
	// 외부 파일 이미지 경로 지정
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/images/**").addResourceLocations("file:///C:/images/");
	}
	
	
}









