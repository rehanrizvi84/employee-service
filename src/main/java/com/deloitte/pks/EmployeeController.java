package com.deloitte.pks;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	private String message ;
	
	public EmployeeController(@Value("${message.key:defaultone}") String msg) {
		 this.message=msg;
		
		
	}

	@GetMapping("/")
	public String hello() {
		return "Hello PAS " + message;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/employee")
	public String getEmployees() {
		
		return "Hello PAL " + message;
	}
	
}
