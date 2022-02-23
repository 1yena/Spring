package com.bitc.java404.service;

import java.util.List;

import com.bitc.java404.dto.ProductDto;

public interface ProductService {
	
	List<ProductDto> selectHotList() throws Exception;
	
	List<ProductDto> selectNewList() throws Exception;

}
