package com.java.builder;

public class Client {
	
	public static void main(String[] args) {
		Director d = new Director();
		d.playBasketBall().execute();
		d.playFootBall().execute();
	}

}
