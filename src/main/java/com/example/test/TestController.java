package com.example.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping()
	public String getName()
	{
		return "Welcome Sandeep";
	}
	
	public String getAge()
	{
		return "Welcome Sandeep";
	}
	
	
	public String getFatherName()
	{
		return "Welcome Sandeep";
	}

}
