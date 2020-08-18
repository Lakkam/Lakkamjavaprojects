package com.lakkam.javaconcepts;

public class MovieInfo implements Comparable<MovieInfo> {

	private String title;
	private String director;
	private String language;
	
	@Override
	public int compareTo(MovieInfo movie) {
		// TODO Auto-generated method stub
		return title.compareTo(movie.getTitle());
	}
	
	public MovieInfo(String title,String director, String language) {
		this.title = title;
		this.director = director;
		this.language = language;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title +" "+director+" "+language;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * }
	 */

}
