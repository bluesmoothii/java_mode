package com.java.builder;

import java.util.ArrayList;
import java.util.List;

public class Director {
	
	private List<String> sequenceList = new ArrayList<String>();

	private BasketballBuilder basketballBuilder = new BasketballBuilder();
	
	private FootballBuilder footballBuilder = new FootballBuilder();
	
	public Basketball playBasketBall () {
		sequenceList.add("run");
		sequenceList.add("warmUp");
		sequenceList.add("start");
		
		basketballBuilder.setSequence(sequenceList);
		return (Basketball)basketballBuilder.getSport();
	}
	
	public Football playFootBall() {
		sequenceList.add("warmUp");
		sequenceList.add("start");
		
		basketballBuilder.setSequence(sequenceList);
		return (Football)footballBuilder.getSport();
	}
}
