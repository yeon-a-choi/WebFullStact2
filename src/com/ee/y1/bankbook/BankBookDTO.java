package com.ee.y1.bankbook;

public class BankBookDTO {
	
	private String booknum;
	private String bookname;
	private double bookrate;
	private boolean booksale;
	
	
	public String getBooknum() {
		return booknum;
	}
	public void setBooknum(String booknum) {
		this.booknum = booknum;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public double getBookrate() {
		return bookrate;
	}
	public void setBookrate(double bookrate) {
		this.bookrate = bookrate;
	}
	public boolean isBooksale() {
		return booksale;
	}
	public void setBooksale(boolean booksale) {
		this.booksale = booksale;
	}
	
	

}
