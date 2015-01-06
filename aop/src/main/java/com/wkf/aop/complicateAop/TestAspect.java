package com.wkf.aop.complicateAop;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import com.wkf.aop.simpleAop.NeedTest;

@Aspect
public class TestAspect {

	@AfterReturning("@annotation(lol)")
	public void needTestFunc(NeedTest lol){
		System.out.println("Aspect worked!");
	}
}
