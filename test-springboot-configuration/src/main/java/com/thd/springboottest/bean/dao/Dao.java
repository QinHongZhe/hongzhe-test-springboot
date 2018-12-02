package com.thd.springboottest.bean.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
@Repository
public class Dao {
	//读取配置文件中的key对应的值
	@Value("${name}")
	private String name;
	@Value("${url}")
	private String url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String toString(){
		return (this.name + " " + this.url);
	}
	
	public Dao(){}
	public Dao(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}
	
}
