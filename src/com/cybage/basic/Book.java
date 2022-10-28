  package com.cybage.basic;

public class Book {
	
	
	private int ISBN;
	private String title;
	private String author;
	
	public Book(int ISBN, String title, String author) {
		
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}

	public int getISBN() {
		return ISBN;
	}
	
	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", author=" + author + "]";
	}

	@Override
	protected void finalize() {
		System.out.println("Finalize Method of Book");
	}

}

