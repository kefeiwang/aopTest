package com.wkf.aop.complicateAop;

import com.wkf.aop.simpleAop.NeedTest;

public class Waiter {
	@NeedTest
	public void getWaiterName(){
		System.out.println("name is lishaomin!");
	}
}
