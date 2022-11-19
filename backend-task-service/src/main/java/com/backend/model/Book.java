/**
 * 
 */
package com.backend.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;




/**
 * @author AvinashSankineni
 *
 */
@Entity
public class Book {
	@Id
	private Integer bookId;
	@Column(length=20)
	private String name;
	@Column(length=100)
	private String author;
	private double cost;
	/**
	 * 
	 */
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param author
	 * @param cost
	 */
	public Book(String name, String author, double cost) {
		super();
		this.name = name;
		this.author = author;
		this.cost = cost;
	}
	/**
	 * @return the bookId
	 */
	public Integer getBookId() {
		return bookId;
	}
	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	/**
	 *
	 */
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", author=" + author + ", cost=" + cost + "]";
	}
	
}
