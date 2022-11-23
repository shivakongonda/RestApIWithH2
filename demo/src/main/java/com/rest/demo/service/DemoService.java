package com.rest.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


import com.rest.demo.dto.PostResponse;
import com.rest.demo.model.CountryCodes;
import com.rest.demo.repository.CountryCodeRepository;

@Service
public class DemoService {
	
	private CountryCodeRepository countryCodeRepository;
	
	public DemoService(CountryCodeRepository countryCodeRepository) {
        this.countryCodeRepository = countryCodeRepository;
  }

    public PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir) {

        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
                : Sort.by(sortBy).descending();

        // create Pageable instance
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

        Page<CountryCodes> countryCodes = countryCodeRepository.findAll(pageable);

        // get content for page object
        List<CountryCodes> listOfPosts = countryCodes.getContent();

        PostResponse postResponse = new PostResponse();
        
        postResponse.setListOFCountryCode(listOfPosts);
       
        return postResponse;
    }

}
