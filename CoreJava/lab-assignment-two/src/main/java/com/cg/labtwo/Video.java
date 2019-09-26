package com.cg.labtwo;

public class Video extends MediaItem{

	private String director;
	private String genre;
	private int yearReleased;
	
	
	
	public Video(String director, String genre, int yearReleased) {
		super();
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}
	

	public Video(int id, String title, int copies, int runtime) {
		super(id, title, copies, runtime);
		// TODO Auto-generated constructor stub
	}
	
	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + ", yearReleased=" + yearReleased + ", toString()="
				+ super.toString() + ", getId()=" + getId() + ", getTitle()=" + getTitle() + ", getCopies()="
				+ getCopies() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
