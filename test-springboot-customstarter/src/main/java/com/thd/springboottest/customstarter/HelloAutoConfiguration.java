package com.thd.springboottest.customstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @Configuration：这个配置就不用多做解释了，我们一直在使用
 * @EnableConfigurationProperties：这是一个开启使用配置参数的注解，
 * value值就是我们配置实体参数映射的ClassType，将配置实体作为配置来源。
 *
 */
@Configuration//开启配置
//启动指定类的 ConfigurationProperties功能；
//将配置文件中对应的值和HelloProperties绑定起来；
//并把 HelloProperties加入到ioc容器中 
@EnableConfigurationProperties(HelloProperties.class)
@ConditionalOnClass(HelloService.class)//存在HelloService时初始化该配置类
@ConditionalOnProperty//存在对应配置信息时初始化该配置类
        (
                prefix = "hello",//存在配置前缀hello
                value = "enabled",//开启
                matchIfMissing = true//缺失检查
        )
public class HelloAutoConfiguration {
	//application.properties配置文件映射前缀实体对象
    @Autowired
    private HelloProperties properties;
    
    //只有一个有参构造器的情况下，参数的值就会从容器中获取）(自动配置),参见该类的@EnableConfigurationProperties(HelloProperties.class)
    public HelloAutoConfiguration(HelloProperties properties){
    	this.properties = properties;
    }
    
    /**
     * 根据条件判断不存在HelloService时初始化新bean到SpringIoc
     * @return
     */
    @Bean//创建HelloService实体bean
    @ConditionalOnMissingBean(HelloService.class)//缺失HelloService实体bean时，初始化HelloService并添加到SpringIoc
    public HelloService helloService()
    {
        System.out.println(">>>The HelloService Not Found，Execute Create New Bean.");
        HelloService helloService = new HelloService();
        helloService.setMsg(this.properties.getMsg());//设置消息内容
        helloService.setShow(this.properties.isShow());//设置是否显示
        return helloService;
    }
}
