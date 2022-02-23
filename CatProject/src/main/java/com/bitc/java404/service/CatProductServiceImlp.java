package com.bitc.java404.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitc.java404.dto.CatProductDto;
import com.bitc.java404.mapper.CatProductMapper;

@Service
public class CatProductServiceImlp implements CatProductService {
	
	@Autowired
	private CatProductMapper catProductMapper;

	@Override
	public List<CatProductDto> selectProductList() throws Exception {
		
		return catProductMapper.selectProductList();
	}

	@Override
	public CatProductDto selectProductDetail(int productSeq) throws Exception {
		
		return catProductMapper.selectProductDetail(productSeq);
	}

	@Override
	public void proinsert(CatProductDto product) throws Exception {
		
		catProductMapper.proinsert(product);
		
		//catProductMapper.insertProduct(product);
		
	}

}
