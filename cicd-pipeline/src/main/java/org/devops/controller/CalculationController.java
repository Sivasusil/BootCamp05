package org.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {
	

	@GetMapping("/add")
	public String sayHello() {
		return "Sum of 20 + 30"+ (20+30);
	}
	
	

}
