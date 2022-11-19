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
public class Doctor{
	
	@Id
	private Integer doctorId;
	@Column(length=20)
	private String doctorName;
	private double fees;
	private int experience;
	/**
	 * 
	 */
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param doctorName
	 * @param fees
	 * @param experience
	 */
	public Doctor(String doctorName, double fees, int experience) {
		super();
		this.doctorName = doctorName;
		this.fees = fees;
		this.experience = experience;
	}
	/**
	 * @return the doctorId
	 */
	public Integer getDoctorId() {
		return doctorId;
	}
	/**
	 * @param doctorId the doctorId to set
	 */
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	/**
	 * @return the doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}
	/**
	 * @param doctorName the doctorName to set
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	/**
	 * @return the fees
	 */
	public double getFees() {
		return fees;
	}
	/**
	 * @param fees the fees to set
	 */
	public void setFees(double fees) {
		this.fees = fees;
	}
	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}
	/**
	 * @param experience the experience to set
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}
	/**
	 *
	 */
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", fees=" + fees + ", experience="
				+ experience + "]";
	}
	

}
