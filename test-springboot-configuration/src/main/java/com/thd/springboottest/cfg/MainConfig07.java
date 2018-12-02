package com.thd.springboottest.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.thd.springboottest.condition.ColorFactoryBean;

//@Configuration  表示是一个配置类
@Configuration 



@ComponentScan(value="com.aaa") 


public class MainConfig07 {
	
	@Bean
	public ColorFactoryBean colorFactoryBean(){
		return new ColorFactoryBean();
	}
}
