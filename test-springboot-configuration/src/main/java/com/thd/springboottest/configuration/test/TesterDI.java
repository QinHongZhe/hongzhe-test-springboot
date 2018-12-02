package com.thd.springboottest.configuration.test;

import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.aothercfg.BeanProperties;
import com.thd.springboottest.bean.service.MyService;
import com.thd.springboottest.bean.service.MyService2;
import com.thd.springboottest.cfg.MainConfig08;
import com.thd.springboottest.cfg.MainConfig09;
import com.thd.springboottest.cfg.MainConfig10;


/**
 * 组件装配相关内容
 */

public class TesterDI extends TestCase {
	@Test
	public void test08(){
		//上下文
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig08.class);
		//打印所有ioc容器中的bean
		String[] beans = ctx.getBeanDefinitionNames();
		for(int i = 0 , j = beans.length ; i < j ; i++){
			System.out.println(i+".:" + beans[i]);
		}
		
		MyService service = (MyService)ctx.getBean("myService");
		System.out.println(service.getDao());
		
		
		//获取运行时环境变量 (@PropertySource引入的.properties文件中的内容)
		ConfigurableEnvironment env = ctx.getEnvironment();
		System.out.println(env.getProperty("name"));
		System.out.println(env.getProperty("classpath"));
	}
	
	
	@Test
	public void test09(){
		//上下文
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig09.class);
		//打印所有ioc容器中的bean
		String[] beans = ctx.getBeanDefinitionNames();
		for(int i = 0 , j = beans.length ; i < j ; i++){
			System.out.println(i+".:" + beans[i]);
			System.out.println(ctx.getBean(beans[i]));
		}
		
		MyService2 service2 = (MyService2)ctx.getBean("myService2");
		System.out.println(service2.getDao3());
		System.out.println(service2.getDao2());
	}
	
	/**
	 * 测试自动配置加载properties类并自动根据其属性到配置文件中找到相应属性并配置
	 */
	@Test
	public void test10(){
		//上下文
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig10.class);
		//打印所有ioc容器中的bean
		String[] beans = ctx.getBeanDefinitionNames();
		for(int i = 0 , j = beans.length ; i < j ; i++){
			System.out.println(i+".:" + beans[i]);
			System.out.println(ctx.getBean(beans[i]));
		}
		
		BeanProperties p = (BeanProperties)ctx.getBean("cfg-com.aothercfg.BeanProperties");
		System.out.println(p);
		System.out.println(p.getA());
	}
	
	//ctx.getEnvironment().getProperty 获取环境变量,参数,配置文件参数
	@Test
	public void test11(){
		//上下文
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig10.class);
		
		System.out.println(ctx.getEnvironment().getProperty("cfg.a"));
	}
	
	
	
}
