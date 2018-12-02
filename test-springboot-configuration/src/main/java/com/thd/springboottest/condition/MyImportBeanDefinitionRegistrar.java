package com.thd.springboottest.condition;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import com.thd.springboottest.bean.animal.Cat;
/**
 * AnnotationMetadata：当前类的注解信息
 * BeanDefinitionRegistry:BeanDefinition注册类；
 * 		把所有需要添加到容器中的bean；调用
 * 		BeanDefinitionRegistry.registerBeanDefinition手工注册进来
 */
public class MyImportBeanDefinitionRegistrar implements
		ImportBeanDefinitionRegistrar {
	
	
	@Override
	public void registerBeanDefinitions(
			AnnotationMetadata importingClassMetadata,
			BeanDefinitionRegistry registry) {
		// TODO Auto-generated method stub
		
		//如果ioc中有id是Red的bean   则注册某bean
		if(registry.containsBeanDefinition("Red")){
			//指定Bean定义信息；（Bean的类型，Bean。。。）
			RootBeanDefinition beanDefinition = new RootBeanDefinition(Cat.class);
			//注册bean并指定bean的id
			registry.registerBeanDefinition("cat", beanDefinition);
		}

	}

}
