package com.libertyloan.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnquiryController {

	
	@GetMapping("/getlogin")
	public String login()
	{
		return "no enquiry found";
	}
	@PostMapping("/postlogin")
	public String loginCheck()
	{
		return "hdhggcvdge";
	}
	@PutMapping("/update")
	public String getData()
	{
		return "update APT";
	}
}
