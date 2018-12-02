package com.thd.springboottest.customstarter;

import org.springframework.stereotype.Service;


public class HelloService {
	//消息内容
    private String msg;
    //是否显示消息内容
    private boolean show = true;

    public String sayHello()
    {
    	System.out.println("sayHello");
    	System.out.println(this.msg);
    	System.out.println(this.show);
        return show ? "Hello，" + msg : "Hidden";
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setShow(boolean show) {
        this.show = show;
    }
}
