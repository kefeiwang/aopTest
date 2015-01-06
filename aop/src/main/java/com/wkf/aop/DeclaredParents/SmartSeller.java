package com.wkf.aop.DeclaredParents;

public class SmartSeller implements Seller {

	@Override
	public void sell(String sellerName) {
		System.out.println(sellerName);
	}

}
