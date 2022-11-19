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
public class Employee{
	
	@Id
	private Integer employeeId;
	@Column(length=20)
	private String name;
	@Column(length=20)
	private String city;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param city
	 * @param salary
	 */
	public Employee(String name, String city, double salary) {
		super();
		this.name = name;
		this.city = city;
		this.salary = salary;
	}
	/**
	 * @return the employeeId
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
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
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 *
	 */
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}

}
