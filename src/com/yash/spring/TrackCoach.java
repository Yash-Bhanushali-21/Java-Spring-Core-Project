package com.yash.spring;

public class TrackCoach implements Coach {
	
	
	//constructor injection variables.
	private FortuneService fortuneService;
	private SleepSchedule sleepSchedule;
	
	//setter injection variables.
	private String record;
	private PerformanceService performanceService;


	public TrackCoach(FortuneService FS, SleepSchedule SS){
		fortuneService  =  FS;
		sleepSchedule = SS;
	}
	public void setRecord(String record) {
		this.record = record;
	}

	public void displayRecordValue() {
		System.out.println("record is" + record);
	}
	public void setPerformanceService(PerformanceService PS) {
		this.performanceService =  PS;
	}
	
	@Override
	public String getPerformance() {
		return performanceService.getPerformance();
	}

	@Override
	public String getDailyWorkout() {
		return "run 2 miles everyday";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	@Override
	public String getSleepSchedule() {
		return sleepSchedule.ProvideSleepSchedule();
	}
	
	
}
