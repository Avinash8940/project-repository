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
public class Item{
	@Id
	private Integer itemId;
	@Column(length=20)
	private String name;
	@Column(length=20)
	private String cuisine;
	private double price;
	/**
	 * 
	 */
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param cuisine
	 * @param price
	 */
	public Item(String name, String cuisine, double price) {
		super();
		this.name = name;
		this.cuisine = cuisine;
		this.price = price;
	}
	/**
	 * @return the itemId
	 */
	public Integer getItemId() {
		return itemId;
	}
	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
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
	 * @return the cuisine
	 */
	public String getCuisine() {
		return cuisine;
	}
	/**
	 * @param cuisine the cuisine to set
	 */
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 *
	 */
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", cuisine=" + cuisine + ", price=" + price + "]";
	}
	
	

}
