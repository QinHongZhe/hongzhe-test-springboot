package com.thd.springboottest.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//启动aspectj自动注解 !!!! 使用aop不要忘记
@EnableAspectJAutoProxy
@ComponentScan("com.thd")
public class MainConfig10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
