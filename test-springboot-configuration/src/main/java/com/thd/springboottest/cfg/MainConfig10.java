package com.thd.springboottest.cfg;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.aothercfg.BeanProperties;
import com.thd.springboottest.bean.dao.Dao;


@Configuration
@ComponentScan({"com.thd.springboottest.bean.service"})


@EnableConfigurationProperties(BeanProperties.class)//加载某个配置属性类并自动配置其属性的值在配置文件中，配置前缀参见BeanProperties的@ConfigurationProperties(prefix = "cfg")


//读取定义外部的配置文件的值 并放到运行时的环境变量中(可使用 )
//运行时环境变量 使用：
//ConfigurableEnvironment env = ctx.getEnvironment();
//System.out.println(env.getProperty("name"));
@PropertySource({"classpath:com/thd/springboottest/cfg/cfg10.properties"})
public class MainConfig10 {

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
