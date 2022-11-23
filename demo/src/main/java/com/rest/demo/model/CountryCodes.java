package com.rest.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country_codes")
public class CountryCodes {
	
	@Column(name ="country")
	private String country;
	
	public CountryCodes(String country, String alpha2code, String alpha3code, int numeric) {
		super();
		this.country = country;
		this.alpha2code = alpha2code;
		this.alpha3code = alpha3code;
		this.numeric = numeric;
	}
	@Column(name ="alpha2code")
	private String alpha2code;
	
	@Column(name ="alpha3code")
	private String alpha3code;
	
	@Id
	@Column(name ="Numeric")
	private int numeric;
	
	public String getAlpha3code() {
		return alpha3code;
	}
	public void setAlpha3code(String alpha3code) {
		this.alpha3code = alpha3code;
	}
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAlpha2code() {
		return alpha2code;
	}
	public void setAlpha2code(String alpha2code) {
		this.alpha2code = alpha2code;
	}
	public int getNumeric() {
		return numeric;
	}
	public void setNumeric(int numeric) {
		this.numeric = numeric;
	}
	
}