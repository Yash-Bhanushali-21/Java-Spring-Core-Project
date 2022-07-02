package com.yash.spring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;

public class MovieList {
	
    Iterator<String> i;
   
	@Autowired(required=false)
	private MovieFinder mf;
	
	//@Autowired	
	private MovieFinder movies;
	
	@Autowired
	void MovieList(MovieFinder m) {
		this.movies = m;
	}

	public void triggerMFShow() {
		this.mf.show();
	}
	
    
    public void ShowMovies() {
    	System.out.println(this.movies);
    	}
	
	
}
