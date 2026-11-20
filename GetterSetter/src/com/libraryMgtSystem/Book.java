package com.libraryMgtSystem;

public class Book {

	private int bookId;
	private String bookName;
	private boolean isAvailable;
	private double price;

	public void setBookId(int id) {
		bookId = id;
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bName) {
		bookName = bName;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean available) {
		isAvailable = available;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double BookPrice) {
		this.price = BookPrice;
	}

}
