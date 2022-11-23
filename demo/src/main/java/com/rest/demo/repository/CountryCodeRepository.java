package com.rest.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.demo.model.CountryCodes;

public interface CountryCodeRepository extends JpaRepository<CountryCodes,Long>{
	

}
