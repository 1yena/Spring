package com.bitc.java404.service;

import java.util.List;

import com.bitc.java404.dto.CatProductDto;

public interface CatProductService {
	
	List<CatProductDto> selectProductList() throws Exception;
	
	CatProductDto selectProductDetail(int productSeq) throws Exception;

	void proinsert(CatProductDto product) throws Exception;
	
	/*
	 * // DB와 연결하여 게시글을 등록하는 메서드 
	 * void insertProduct(CatProductDto board) throws Exception;
	 */

}
