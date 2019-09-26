package com.cg.labtwo;

public abstract class WrittenItem extends Item{
	private String author;
	
	public WrittenItem(int id, String title, int copies,String author){
		super(id,title,copies);
		this.author=author;
	}
	
	public WrittenItem() {
		this.author="Paulo Coehlo";
		System.out.println();
	}
	
	public String getAuthor() {
		return author;
	}

	@Override
	public void print() {
		System.out.println("Print");
		
	}

	@Override
	public void checkIn() {
		System.out.println("Checking Out");
		
	}

	@Override
	public void checkOut() {
		System.out.println("Checking In");
		
	}
	
	public abstract void write();

}
