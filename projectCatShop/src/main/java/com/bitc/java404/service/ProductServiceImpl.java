package com.bitc.java404.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitc.java404.dto.ProductDto;
import com.bitc.java404.mapper.CatShopProductMapper;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	CatShopProductMapper catmapper;

	@Override
	public List<ProductDto> selectHotList() throws Exception {
		
		return catmapper.selectHotList();
		
	}

	@Override
	public List<ProductDto> selectNewList() throws Exception {
		
		return catmapper.selectNewList();
	
	}

}
