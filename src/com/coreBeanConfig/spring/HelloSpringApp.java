package com.coreBeanConfig.spring;
import org.springframework.context.support.ClassPathXmlApplicationContext; //import the context class!

public class HelloSpringApp {

	public static void main(String[] args) {
		//entry level component for spring ..!
//second step : create spring container
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//third step : retrieve the bean.
BaseballCoach theCoach = context.getBean("baseBallCoach",BaseballCoach.class);

System.out.println(theCoach.getDailyWorkout());
System.out.println(theCoach.getDailyFortune());
System.out.println(theCoach.getSleepSchedule());

//this is for the literal property setter.
theCoach.displayRecordValue();

//this is for the bean/class property setter.
System.out.println(theCoach.getPerformance());

System.out.println(theCoach.getEmailAddress());
System.out.println(theCoach.getTeamName());



//instantiating the Class SleepImplementer instead of Interface SleepSchedule
//cause we also want method that SleepImplementer has along with the interface implementations !
SleepImplementer ss = context.getBean("SleepImp", SleepImplementer.class);
System.out.println(ss.ProvideSleepSchedule());
System.out.println(ss.getMethodWithoutInterface());




context.close();

	}

}
