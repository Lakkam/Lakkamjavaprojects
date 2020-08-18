package com.lakkam.javaconcepts;

import java.util.Comparator;

public class GeneralSort implements Comparator<MovieInfo> {
	
	@Override
	public int compare(MovieInfo o1, MovieInfo o2) {
		// TODO Auto-generated method stub
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
