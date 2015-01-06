package com.wkf.aop.DeclaredParents;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EnableSellerAspect {
	@DeclareParents(value="com.wkf.aop.complicateAop.Waiter",
			defaultImpl=SmartSeller.class)
	public Seller seller;
}
