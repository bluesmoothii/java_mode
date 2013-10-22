package com.java.factory;

public class ProductFactory {

	public static Integer APPLETYPE = 1;

	public static Integer GOOGLETYPE = 2;

	public static Product getProduct(int type) {
		if (type == APPLETYPE) {
			return new Apple();
		}

		return new Google();
	}
}
