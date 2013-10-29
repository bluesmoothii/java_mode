package com.java.proxy;

import java.lang.reflect.InvocationHandler;


public class MyDynamicProxy extends MyProxy {
	
	public static <T> T newProxyInstance (Subject obj) {
		ClassLoader loader = obj.getClass().getClassLoader();
		
		Class<?>[] classes = obj.getClass().getInterfaces();
		
		InvocationHandler handler = new MyinvocationHandler(obj);
		
		return newProxyInstance(loader, classes, handler);
	}

}
