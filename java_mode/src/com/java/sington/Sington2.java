package com.java.sington;
/**
 * 单例2
 * @author lyh
 * @version
 */
public class Sington2 {

	private Sington2() {

	}

	private static Sington2 NEWSINGTON;

	public Sington2 getInstance() {
		if (NEWSINGTON == null) {
			NEWSINGTON = new Sington2();
		}
		return NEWSINGTON;
	}

}
