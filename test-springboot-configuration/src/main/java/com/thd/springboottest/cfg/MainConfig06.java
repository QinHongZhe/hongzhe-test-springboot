package com.thd.springboottest.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.thd.springboottest.bean.color.Red;
import com.thd.springboottest.condition.MyImportBeanDefinitionRegistrar;

//@Configuration  表示是一个配置类
@Configuration 



//在这里配置的包是一个不存在的包，是为了测试@Import(MyImportBeanDefinitionRegistrar.class)
//如果不配置@Import(MyImportBeanDefinitionRegistrar.class)  则会扫描所有的类
@ComponentScan(value="com.abc") 

//引入一个实现ImportBeanDefinitionRegistrar的类, 
//在ImportBeanDefinitionRegistrar.registerBeanDefinitions接口的 手工注册bean
@Import(MyImportBeanDefinitionRegistrar.class)

/**
 * 使用ImportBeanDefinitionRegistrar进行手工注册的优点 - 灵活：
 * 1.可以指定bean的id
 * 2.可以动态注册
 * 3.可以根据条件判断进行注册
 *
 */
public class MainConfig06 {
	
	@Bean("Red")
	public Red red(){
		return new Red();
	}
}
