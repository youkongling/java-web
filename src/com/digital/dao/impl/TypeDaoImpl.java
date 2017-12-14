package com.digital.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.digital.dao.TypeDao;
import com.digital.entity.Type;

public class TypeDaoImpl implements TypeDao {
     
	private SessionFactory sefa;
	public void setSefa(SessionFactory sefa) {
		this.sefa = sefa;
	}
	@Override
	public List<Type> getAll() {
		List<Type> typeList =null;
         Session session=sefa.getCurrentSession();
         Criteria c=session.createCriteria(Type.class);
         typeList=c.list();
		return typeList;
	}
	

}
