package com.java.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class Sport {
	
	public List<String> sequenceList = new ArrayList<String>();

	public void execute() {
		for (int i = 0; i < sequenceList.size(); i++) {
			String seq = sequenceList.get(0);
			if ("run".equals(seq)) {
				this.run();
			} else if ("warmUp".equals(seq)) {
				this.warmUp();
			} else if ("start".equals(seq)) {
				this.start();
			}
		}
	}
	
	public abstract void run();
	
	public abstract void warmUp();
	
	public abstract void start();

	public void setSequence (List<String> list) {
		this.sequenceList = list;
		
	}
}
