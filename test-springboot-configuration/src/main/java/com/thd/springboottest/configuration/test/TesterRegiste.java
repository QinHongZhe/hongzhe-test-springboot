package com.thd.springboottest.configuration.test;

import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thd.springboottest.bean.color.Color;
import com.thd.springboottest.bean.humen.Person;
import com.thd.springboottest.bean.humen.Teacher;
import com.thd.springboottest.cfg.MainConfig;
import com.thd.springboottest.cfg.MainConfig02;
import com.thd.springboottest.cfg.MainConfig03;
import com.thd.springboottest.cfg.MainConfig04;
import com.thd.springboottest.cfg.MainConfig05;
import com.thd.springboottest.cfg.MainConfig06;
import com.thd.springboottest.cfg.MainConfig07;


/**
 * 给容器中注册组件；
 * 1）、包扫描+组件标注注解（@Controller/@Service/@Repository/@Component）[自己写的类]
 * 2）、@Bean[导入的第三方包里面的组件]
 * 3）、@Import[快速给容器中导入一个组件]
 * 		1）、@Import(要导入到容器中的组件)；容器中就会自动注册这个组件，id默认是全类名
 * 		2）、ImportSelector:返回需要导入的组件的全类名数组；
 * 		3）、ImportBeanDefinitionRegistrar:手动注册bean到容器中
 * 4）、使用Spring提供的 FactoryBean（工厂Bean）;
 * 		1）、默认获取到的是工厂bean调用getObject创建的对象
 * 		2）、要获取工厂Bean本身，我们需要给id前面加一个&
 * 			&colorFactoryBean
 */

public class TesterRegiste extends TestCase {
	@Test
	public void test01(){
		//上下文
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		//根据类型获取bean
		Person person = ctx.getBean(Person.class);
		//根据id获取bean
		Person person1 = (Person)ctx.getBean("person1");
		System.out.println(person);
		System.out.println(person1);
		System.out.println(person == person1);
		
		Teacher teacher = (Teacher)ctx.getBean("myteacher");
		System.out.println(teacher);
		
		
		//打印所有ioc容器中的bean
		String[] beans = ctx.getBeanDefinitionNames();
		for(int i = 0 , j = beans.length ; i < j ; i++){
			System.out.println(i+".:" + beans[i]);
		}
	}
	
	@Test
	public void test02(){
		//上下文
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig02.class);
		
		//打印所有ioc容器中的bean
		String[] beans = ctx.getBeanDefinitionNames();
		for(int i = 0 , j = beans.length ; i < j ; i++){
			System.out.println(i+".:" + beans[i]);
		}
		/**
		 * 职能扫描到Person,Teacher,而Cat Dog等类没有扫描到 , 因为MainCOnfig02中 @ComponentScan 扫描的包是com.thd.springboottest.bean.Humen
		 */
	}
	
	@Test
	public void test03(){
		//上下文
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig03.class);
		
		//打印所有ioc容器中的bean
		String[] beans = ctx.getBeanDefinitionNames();
		for(int i = 0 , j = beans.length ; i < j ; i++){
			System.out.println(i+".:" + beans[i]);
		}
				
	}
	
	@Test
	public void test04(){
		//上下文
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig04.class);
		
		//打印所有ioc容器中的bean
		String[] beans = ctx.getBeanDefinitionNames();
		for(int i = 0 , j = beans.length ; i < j ; i++){
			System.out.println(i+".:" + beans[i]);
		}
				
	}
	
	@Test
	//实现接口ImportSelector方法注册bean
	public void test05(){
		//上下文
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig05.class);
		//打印所有ioc容器中的bean
		String[] beans = ctx.getBeanDefinitionNames();
		for(int i = 0 , j = beans.length ; i < j ; i++){
			System.out.println(i+".:" + beans[i]);
		}
	}
	
	
	@Test
	//实现MyImportBeanDefinitionRegistrar方法手工注册bean
	public void test06(){
		//上下文
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig06.class);
		//打印所有ioc容器中的bean
		String[] beans = ctx.getBeanDefinitionNames();
		for(int i = 0 , j = beans.length ; i < j ; i++){
			System.out.println(i+".:" + beans[i]);
		}
	}
	
	@Test
	//实现MyImportBeanDefinitionRegistrar方法手工注册bean
	public void test07(){
		//上下文
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig07.class);
		//打印所有ioc容器中的bean
		String[] beans = ctx.getBeanDefinitionNames();
		for(int i = 0 , j = beans.length ; i < j ; i++){
			System.out.println(i+".:" + beans[i]);
		}
		
		Color r = (Color)ctx.getBean("colorFactoryBean");
		System.out.println(r);
		
	}
}
