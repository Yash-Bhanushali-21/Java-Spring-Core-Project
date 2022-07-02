package com.coreBeanConfig.spring;

public class SleepImplementer implements SleepSchedule {

	@Override
	public String ProvideSleepSchedule() {
		return "Sleep for 8 hours a day!";
	}
	public String getMethodWithoutInterface() {
	return "this is a method without interface from beans!";
	}

	
}
