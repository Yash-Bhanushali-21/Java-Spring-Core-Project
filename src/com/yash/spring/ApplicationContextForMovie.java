package com.yash.spring;
import org.springframework.context.support.ClassPathXmlApplicationContext; //import the context class!


/**
 * @author zorro
 *
 */
public class ApplicationContextForMovie {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MovieList MovieFinderBean = context.getBean("MovieList",MovieList.class);
		MovieFinderBean.ShowMovies();

	}

}
