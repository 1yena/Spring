package com.bitc.java404.dto;

import lombok.Data;

@Data
public class CatProductDto {
	
	private int productSeq;         //번호
	private String productBrand;    //브랜드
	private String productName;     //상품명
	private String productPrice;    //가격
	private String productSale;     //할인가
	private String productOrigin;   //원산지
	private String productDate;     //유통기한
	private String productDeliver;  //배송비
	private String productKind;	    //대분류
	private String productCate;	    //소분류

}
