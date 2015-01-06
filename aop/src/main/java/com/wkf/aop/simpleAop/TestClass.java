package com.wkf.aop.simpleAop;

public class TestClass {
	
	@NeedTest(value=true)
	public void funcA(){
		
	}
	
	@NeedTest(value=false)
	public void funB(){
		
	}
}
