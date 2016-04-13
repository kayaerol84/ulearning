package com.ulearning.model;

public enum RankingType {

	RankedAsALearner("LEARNER"),
	RankedAsATeacher("TEACHER");

	private String value;
	
	private RankingType(String value) {
		// TODO Auto-generated constructor stub
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
}
