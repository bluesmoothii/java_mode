package com.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyProxy {
	
	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] 
			interfaces, InvocationHandler h) {
		//...这里可以做前置处理
		
		return (T)Proxy.newProxyInstance(loader, interfaces, h);
	}

}
