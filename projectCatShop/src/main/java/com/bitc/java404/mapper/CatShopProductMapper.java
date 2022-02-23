package com.bitc.java404.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bitc.java404.dto.ProductDto;

@Mapper
public interface CatShopProductMapper {

	List<ProductDto> selectHotList() throws Exception;

	List<ProductDto> selectNewList() throws Exception;

}
