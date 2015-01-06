package com.wkf.aop.complicateAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComlicateAopMain {

	public static void main(String[] args) {
		String configPath = "main/resources/applicationContext.xml";
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Waiter waiter = (Waiter)app.getBean("waiter");//必须由spring注入，这样那些annotation才有效
		waiter.getWaiterName();
	}

}
