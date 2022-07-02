package com.yash.spring;

import java.util.HashSet;
import java.util.*;

public class MovieFinder {
	
	Set<String> h = new HashSet<String>();
	private ArrayList<String> movieCatalogs;

	public MovieFinder() {
		h.add("Test");
		System.out.println("I am Constructed!");
	}
	public void setMovieProvider(ArrayList<String> movies) {
		this.movieCatalogs = movies;
	}
	public void show() {
		System.out.println("Called the injected bean method!");

	}
}
