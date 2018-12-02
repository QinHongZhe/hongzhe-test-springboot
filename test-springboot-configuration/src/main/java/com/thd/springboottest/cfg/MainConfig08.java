package com.thd.springboottest.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.ConfigurableEnvironment;


@Configuration
@ComponentScan({"com.thd.springboottest.bean.dao","com.thd.springboottest.bean.service"})

//读取定义外部的配置文件的值 并放到运行时的环境变量中(可使用 )
//运行时环境变量 使用：
//ConfigurableEnvironment env = ctx.getEnvironment();
//System.out.println(env.getProperty("name"));
@PropertySource({"classpath:com/thd/springboottest/cfg/cfg08.properties"})
public class MainConfig08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
