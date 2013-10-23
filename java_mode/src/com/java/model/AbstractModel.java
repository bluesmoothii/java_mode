package com.java.model;

/**
 * model mode
 * 抽象类定义业务流程，由子类实现具体方法
 * 常见的mvc框架也是采用此模式
 * @author lyh
 * @version
 */
public abstract class AbstractModel {
	
	public int getTotal () {
		int total = getSize() * getWidth();
		return total;
	}
	
	public abstract int getSize();
	
	public abstract int getWidth();
}
