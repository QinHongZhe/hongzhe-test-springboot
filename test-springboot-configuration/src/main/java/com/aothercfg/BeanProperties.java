package com.aothercfg;

import org.springframework.boot.context.properties.ConfigurationProperties;
@ConfigurationProperties(prefix = "cfg")
public class BeanProperties {
	
	private String a;
	
	
	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	
	
}
