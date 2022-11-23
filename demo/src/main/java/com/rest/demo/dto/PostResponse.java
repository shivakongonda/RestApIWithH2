package com.rest.demo.dto;

import java.util.List;

import com.rest.demo.model.CountryCodes;

public class PostResponse {
	
	public List<CountryCodes> getListOFCountryCode() {
		return listOFCountryCode;
	}

	public void setListOFCountryCode(List<CountryCodes> listOFCountryCode) {
		this.listOFCountryCode = listOFCountryCode;
	}

	private List<CountryCodes> listOFCountryCode;

}
