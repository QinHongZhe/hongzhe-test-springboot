package com.thd.springboottest.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.thd.springboottest.bean.humen.Person;
import com.thd.springboottest.bean.humen.Teacher;

//@Configuration  表示是一个配置类
@Configuration 

//配置扫描的包范围 
@ComponentScan(value="com.thd.springboottest.bean.Humen") 
public class MainConfig02 {
	
	
}
