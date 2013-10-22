package com.java.sington;

/**
 * µ¥Àý
 * @author lyh
 * @version
 */
public class Sington1 {

	private Sington1() {

	}

	private static final Sington1 NEWSINGTON = new Sington1();

	public Sington1 getInstance() {
		return NEWSINGTON;
	}

}
