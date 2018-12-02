package com.thd.springboottest.bean.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.thd.springboottest.bean.dao.Dao;

@Service
public class MyService2 {
	/**
	 * @Autowired 自动注入
	 * 1.优先按照类型在容器中进行查找bean，找到后赋值
	 * 2.如果匹配到多个bean则按照属性名称
	 * 
	 */
	@Qualifier("dao3")
	@Autowired
	private Dao dao3;
	
	/**
	 * @Qualifier 是按照bean的id进行装配 ， 也可以将@bean和@Primary结合达到同样效果
	 */
	@Qualifier("dao3")
	@Autowired
	private Dao dao2;
	
	
	
	public Dao getDao3() {
		return dao3;
	}

	public void setDao3(Dao dao3) {
		this.dao3 = dao3;
	}

	public Dao getDao2() {
		return dao2;
	}

	public void setDao2(Dao dao2) {
		this.dao2 = dao2;
	}

	
	
	
	
	
}
