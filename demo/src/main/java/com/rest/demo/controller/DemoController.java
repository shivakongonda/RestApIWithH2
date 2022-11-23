package com.rest.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rest.demo.dto.PostResponse;
import com.rest.demo.service.DemoService;

@RequestMapping("GET/api/countries")
public class DemoController {
	
	private DemoService demoService;
	
	 public DemoController(DemoService demoService) {
	        this.demoService = demoService;
	    }
	 
	// get all posts rest api
	    @GetMapping
	    public PostResponse getAllPosts(
	            @RequestParam(value = "page", defaultValue = "0", required = false) int pageNo,
	            @RequestParam(value = "size", defaultValue = "1", required = false) int pageSize,
	            @RequestParam(value = "sortBy", defaultValue = "country", required = false) String sortBy,
	            @RequestParam(value = "sortDir", defaultValue = "asc", required = false) String sortDir
	    ){
	    	System.out.println("entered into get mapping service::::::");
	        return demoService.getAllPosts(pageNo, pageSize, sortBy, sortDir);
	    }
	
	
	
}