package com.libertyloan.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnquiryController {

//	@GetMapping("/getEnquires")
//	public String getEnquiry()
//	{
//	  return "No Enquiry Found ..!";
//		
//	}
	@GetMapping("/getlogin")
	public String login()
	{
		return "no enquiry found";
	}
	
}
