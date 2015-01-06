package com.wkf.aop.simpleAop;

import java.lang.reflect.Method;

public class SimleAopMain {

	public static void main(String[] args) {
		Class clazz = TestClass.class;
		Method[] methods = clazz.getMethods();
		for(Method method : methods){
			NeedTest nt = method.getAnnotation(NeedTest.class);
			if(nt != null){
				if(nt.value()){
					System.out.println("FuncA!");
				}else{
					System.out.println("FuncB!");
				}
			}
		}
	}

}
