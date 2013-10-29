package com.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyinvocationHandler implements InvocationHandler{
	
	private Subject subject = null;
	
	public MyinvocationHandler(Subject obj) {
		this.subject = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		return method.invoke(subject, args);
	}

}
