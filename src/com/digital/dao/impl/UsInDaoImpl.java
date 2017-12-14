package com.digital.dao.impl;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.digital.dao.UsInDao;
import com.digital.entity.User;

public class UsInDaoImpl implements UsInDao {
    private SessionFactory sessionFactory;  /* hibernate 编写查询  查出集合编写步骤  
	                                         1：创建查询对象 查询到的是字节对象 UserInfo这个类
	                                         2：工具类创建事例对象 将数据放入 解析对象里的字段属性  
	                                                                                                     调用查询的添加方法把值传入进行拼接sql 查询结果集返回*/
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public List<User> search(User user) {
		Session se=sessionFactory.getCurrentSession();
		List<User> us=null;
		Criteria c=se.createCriteria(User.class);
		Example ex=Example.create(user);
		c.add(ex);
		us=c.list();
		return us;
	}
   // 数据访问层完成 接口 类 服务层service 
}
