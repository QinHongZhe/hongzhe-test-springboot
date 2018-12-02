package com.thd.springboottest.test;

import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thd.springboottest.cfg.MainConfig10;
import com.thd.springboottest.service.MathService;


/**
 * 组件装配相关内容
 */

public class TesterAop extends TestCase {
	@Test
	public void test10(){
		//上下文
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig10.class);
		
		System.out.println("=======================");
		String[] beans = ctx.getBeanDefinitionNames();
		for(int i = 0 , j = beans.length ; i < j ; i++){
			System.out.println(i+".:" + beans[i]);
		}
		System.out.println("=======================");
		
		
		MathService service = ctx.getBean(MathService.class);
		System.out.println(service.add(1, 2));
		System.out.println("--------");
		System.out.println(service.div(100, 2));
		System.out.println("--------");
		System.out.println(service.div(100, 0));
	}
	
	
}
