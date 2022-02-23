package com.bitc.java404.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bitc.java404.dto.CatProductDto;

@Mapper
public interface CatProductMapper {
	
	public List<CatProductDto> selectProductList() throws Exception; 			// 상품 리스트
	
	public CatProductDto selectProductDetail(int productSeq) throws Exception; 	//상품 상세설명

	void proinsert(CatProductDto product) throws Exception;


	/*
	 * // DB와 연결하여 게시글을 등록하는 메서드 
	 * void insertBoard(BoardDto board) throws Exception;
	 */

}
