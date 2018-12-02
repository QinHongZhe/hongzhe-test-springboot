package com.thd.springboottest.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.thd.springboottest.condition.MyImportSelector;

//@Configuration  表示是一个配置类
@Configuration 



//在这里配置的包是一个不存在的包，是为了测试@Import(MyImportSelector.class)
//如果不配置@ComponentScan(value="com.abc")  则会扫描所有的类
@ComponentScan(value="com.abc") 

//引入一个实现ImportSelector的类, 会注册 实现该类的selectImports方法中返回的全类名数组
@Import(MyImportSelector.class)
public class MainConfig05 {
	
	
}
