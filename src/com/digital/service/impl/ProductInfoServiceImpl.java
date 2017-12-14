package com.digital.service.impl;

import java.util.List;

import com.digital.dao.ProductInfoDao;
import com.digital.entity.ProductInfo;
import com.digital.service.ProductInfoService;

public class ProductInfoServiceImpl implements ProductInfoService {

	private ProductInfoDao pidao;
	@Override
	public List<ProductInfo> getAll() {
		// TODO Auto-generated method stub
		return pidao.getAll();
	}

	public void setPidao(ProductInfoDao pidao) {
		this.pidao = pidao;
	}

	@Override
	public ProductInfo getProductInfoByPid(int pid) {
		
		return pidao.getProductInfoByPid(pid);
	}

}
