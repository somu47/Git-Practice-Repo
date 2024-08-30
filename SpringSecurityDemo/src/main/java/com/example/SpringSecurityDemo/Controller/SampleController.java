package com.example.SpringSecurityDemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController{
	@GetMapping("/yoga")
	public String getMessage() {
		return "Hello yogaaaaa";
	}
	
	
	
}