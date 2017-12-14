package com.digital.service;

import java.util.List;

import com.digital.dao.UsInDao;
import com.digital.entity.User;

public class UsInSeImpl implements UsInService {
    
	private UsInDao UID;

	@Override
	
	
	public List<User> login(User user) {
		//服务层一般要先进行逻辑判断
		return UID.search(user);
	}

	public void setUID(UsInDao uID) {
		UID = uID;
	}
 
}
