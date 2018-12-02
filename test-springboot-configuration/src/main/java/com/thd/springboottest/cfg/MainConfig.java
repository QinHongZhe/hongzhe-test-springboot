package com.thd.springboottest.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thd.springboottest.bean.humen.Person;
import com.thd.springboottest.bean.humen.Teacher;

//@Configuration  表示是一个配置类
@Configuration 
public class MainConfig {
	
	//@Bean 表示给容器中注册一个Bean,bean的id是该方法的方法名
	@Bean
	public Person person1(){
		return new Person("张三",20);
	}
	
	//通过注释修改bean 的 id
	@Bean("myteacher")
	public Teacher teachersssss(){
		return new Teacher("李四",30);
	}
}
