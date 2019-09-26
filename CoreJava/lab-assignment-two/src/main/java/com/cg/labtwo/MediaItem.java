package com.cg.labtwo;

public abstract class MediaItem extends Item{

	private int runtime;
	
	public MediaItem() {
		super();
	}

	public MediaItem(int id, String title, int copies,int runtime) {
		super(id, title, copies);
		this.runtime=runtime;
	}

	@Override
	public String toString() {
		return "MediaItem [runtime=" + runtime + ", getId()=" + getId() + ", getTitle()=" + getTitle()
				+ ", getCopies()=" + getCopies() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	

}
