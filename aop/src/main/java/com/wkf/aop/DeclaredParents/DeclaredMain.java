package com.wkf.aop.DeclaredParents;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wkf.aop.complicateAop.Waiter;

public class DeclaredMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Waiter waiter = (Waiter)ctx.getBean("waiter");
		Seller seller = (Seller)waiter;
		seller.sell("mike!");
	}
}
