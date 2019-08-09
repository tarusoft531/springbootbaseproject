package com.excelsheetrendering.bean;

import java.util.Date;

import org.springframework.stereotype.Repository;

@Repository
public class Book {

	private int id;
	private int isbn;
	private String title;
	private String author;
	private Date publisheddate;
	private float price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
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

	public Date getPublisheddate() {
		return publisheddate;
	}

	public void setPublisheddate(Date publisheddate) {
		this.publisheddate = publisheddate;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", author=" + author + ", publisheddate="
				+ publisheddate + ", price=" + price + "]";
	}

}
