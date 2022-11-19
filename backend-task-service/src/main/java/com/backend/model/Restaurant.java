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
public class Restaurant{
	@Id
	private Integer restaurantId;
	@Column(length=20)
	private String name;
	@Column(length=20)
	private String city;
	private double rating;
	/**
	 * 
	 */
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param city
	 * @param rating
	 */
	public Restaurant(String name, String city, double rating) {
		super();
		this.name = name;
		this.city = city;
		this.rating = rating;
	}
	/**
	 * @return the restaurantId
	 */
	public Integer getRestaurantId() {
		return restaurantId;
	}
	/**
	 * @param restaurantId the restaurantId to set
	 */
	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
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
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}
	/**
	 *
	 */
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", name=" + name + ", city=" + city + ", rating=" + rating
				+ "]";
	}
	
	

}
