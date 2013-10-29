package com.java.proxy;

/**
 * 动态代理模式
 * @author lyh
 * @version
 */

public class Client {
	
	public static void main(String[] args) {
		Subject subject = new SubjectImpl();
		
		Subject proxy = MyDynamicProxy.newProxyInstance(subject);
		
		proxy.doSomeThing();
	}

}
 