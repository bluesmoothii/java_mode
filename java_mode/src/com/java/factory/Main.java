package com.java.factory;

/**
 * 工厂模式优点：调用代码不需要知道对象的具体实现，只要知道一个类型即可
 * 利于扩展
 * @author lyh
 * @version
 */

public class Main {
	
	public static void main(String[] args) {
		Apple apple = (Apple)ProductFactory.getProduct(ProductFactory.APPLETYPE);
		apple.price();
	}

}
