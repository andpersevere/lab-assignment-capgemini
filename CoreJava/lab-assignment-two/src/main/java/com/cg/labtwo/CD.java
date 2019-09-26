package com.cg.labtwo;

public class CD extends MediaItem{

	private String artist;
	private String genre;
	
	
	public CD(String artist, String genre) {
		super();
		this.artist = artist;
		this.genre = genre;
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
		return "CD [artist=" + artist + ", genre=" + genre + ", toString()=" + super.toString() + ", getId()=" + getId()
				+ ", getTitle()=" + getTitle() + ", getCopies()=" + getCopies() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

}
