package com.java.builder;

import java.util.List;

public class FootballBuilder extends SportBuilder {
	
	private Football football = new Football();

	@Override
	public void setSequence(List<String> list) {
		this.football.setSequence(list);
	}

	@Override
	public Sport getSport() {
		return this.football;
	}
	

}
