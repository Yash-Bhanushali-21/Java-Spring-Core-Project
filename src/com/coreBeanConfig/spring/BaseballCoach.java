package com.coreBeanConfig.spring;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	private SleepSchedule sleepSchedule;
	private String record;
	private PerformanceService performanceService;
	
	private String emailAddress;
	private String team;
	
	
	public BaseballCoach() {
		//empty constructor to avoid default constructor
	}
	
	public BaseballCoach(FortuneService FS, SleepSchedule SS){
		fortuneService  =  FS;
		sleepSchedule = SS;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress= emailAddress;
	}
	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	public void setTeamName(String team) {
		this.team= team;
	}
	public String getTeamName() {
		return this.team;
	}

	
	public void setRecord(String record) {
		this.record = record;
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
		return "do 20 pushups";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	@Override
	public String getSleepSchedule() {
		return sleepSchedule.ProvideSleepSchedule();
	}
	public void displayRecordValue() {
		System.out.println("record is" + record);
	}

	
	public static void main(String[] args) {
		System.out.println("from the main method of baseball coach !");	}
	
}
