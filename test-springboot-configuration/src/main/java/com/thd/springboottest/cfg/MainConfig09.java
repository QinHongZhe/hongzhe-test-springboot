package com.thd.springboottest.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.thd.springboottest.bean.dao.Dao;


@Configuration
@ComponentScan({"com.thd.springboottest.bean.service"})

//读取定义外部的配置文件的值 并放到运行时的环境变量中(可使用 )
//运行时环境变量 使用：
//ConfigurableEnvironment env = ctx.getEnvironment();
//System.out.println(env.getProperty("name"));
@PropertySource({"classpath:com/thd/springboottest/cfg/cfg08.properties"})
public class MainConfig09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	@Bean
	public Dao dao(){
		return new Dao("dao","http://www.baidus.com");
	}
	@Bean
	public Dao dao2(){
		return new Dao("dao2","http://www.baiduss.com");
	}
	@Bean
	public Dao dao3(){
		return new Dao("dao3","http://www.baidusss.com");
	}

}
