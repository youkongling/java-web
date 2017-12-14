package com.digital.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.digital.dao.ProductInfoDao;
import com.digital.entity.ProductInfo;
import com.digital.entity.Type;

public class ProductInfoDaoImpl implements ProductInfoDao {

	@Override
	public List<ProductInfo> getAll() {
		List<ProductInfo> piList =null;
        Session session=sefa.getCurrentSession();
        Criteria c=session.createCriteria(ProductInfo.class);
        piList=c.list();
		return piList;
	}
	private SessionFactory sefa;
	public void setSefa(SessionFactory sefa) {
		this.sefa = sefa;
	}
		
	
	@Override
	public ProductInfo getProductInfoByPid(int pid) {
		Session session=sefa.getCurrentSession();
		ProductInfo pi=session.get(ProductInfo.class,pid);
		return pi;
	}

}
