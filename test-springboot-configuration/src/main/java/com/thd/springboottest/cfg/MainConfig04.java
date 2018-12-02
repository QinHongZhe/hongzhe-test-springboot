package com.thd.springboottest.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.thd.springboottest.bean.animal.Cat;
import com.thd.springboottest.bean.animal.Dog;

//@Configuration  表示是一个配置类
@Configuration 

//快速注册一个bean, 被注册的bean的id是class的全名称
//@Import({Cat.class,Dog.class})



//注册的bean也可以是一个配置类,被引入的配置类中的bean也会引入进来
@Import({MainConfig.class,MainConfig02.class,MainConfig03.class})
public class MainConfig04 {
	
	
}
