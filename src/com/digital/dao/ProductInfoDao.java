package com.digital.dao;

import java.util.List;
import com.digital.entity.ProductInfo;

public interface ProductInfoDao {

	public List<ProductInfo> getAll();
	
	public ProductInfo getProductInfoByPid(int pid);
}
