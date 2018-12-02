package com.thd.springboottest.bean.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thd.springboottest.bean.dao.Dao;

@Service
public class MyService {
	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	/**
	 * @Autowired 自动注入
	 * 1.优先按照类型在容器中进行查找bean，找到后赋值
	 * 2.如果匹配到多个bean则按照属性名称
	 * 
	 */
	@Autowired
	private Dao dao;
	
	
}
