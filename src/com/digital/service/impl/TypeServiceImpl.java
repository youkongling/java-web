package com.digital.service.impl;

import java.util.List;

import com.digital.dao.TypeDao;
import com.digital.entity.Type;
import com.digital.service.TypeService;

public class TypeServiceImpl implements TypeService {

	private TypeDao td;
	
	public void setTd(TypeDao td) {
		this.td = td;
	}
	@Override
	public List<Type> getAll() {
		
		return td.getAll();
	}

}
