package com.lakkam.javaconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionConcepts implements Comparable<CollectionConcepts> {

	String familyInfo = "Lakkam 1984 Nani 1985 Prachet 2010 Bangalore Inida";
	String dob = "1984";

	@Override
	public int compareTo(CollectionConcepts sortingType) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		List<MovieInfo> myArrayList = new ArrayList<>();
		MovieInfo movieObject1 = new MovieInfo("Bahubali", "Rajamouli", "Telugu");
		myArrayList.add(movieObject1);

		MovieInfo movieObject2 = new MovieInfo("Avatar", "James", "English");
		myArrayList.add(movieObject2);

		MovieInfo movieObject3 = new MovieInfo("Ramayan", "Rajamouli", "Tamil");
		myArrayList.add(movieObject3);

		System.out.println("Unsorted : " + myArrayList.toString());
		Collections.sort(myArrayList);
		System.out.println("Sorted by Title with Comparable Interface: " + myArrayList.toString());
		
		
		Collections.sort(myArrayList, new GeneralSort());
		System.out.println("Sorted by Title with Comparator Interface: " + myArrayList.toString());


	}

}
