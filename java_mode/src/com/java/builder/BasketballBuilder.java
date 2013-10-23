package com.java.builder;

import java.util.ArrayList;
import java.util.List;

public class BasketballBuilder extends SportBuilder{
	
	private Basketball basketball= new Basketball();

	@Override
	public void setSequence(List<String> list) {
		this.basketball.setSequence(list);
	}

	@Override
	public Sport getSport() {
		return this.basketball;
	}

}
