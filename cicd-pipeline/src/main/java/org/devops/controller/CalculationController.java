package org.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {
	

	@GetMapping("/add")
	public String add() {
		return "Sum of 20 + 30 : "+ (20+30);
	}
	
	@GetMapping("/subtract")
	public String subtract() {
		return "Subtract of 30 - 20 : "+ (30-20);
	}

	@GetMapping("/Division")
	public String division() {
		return "Division of 6/2 : "+ (6/2);
	}

	@GetMapping("/Reminder")
	public String reminder() {
		return "Reminder of 6%2 : "+ (6%2);
	}

	@GetMapping("/Showcase")
	public String showcase() {
		return "I AM A CALCULATOR";
	}
	
	@GetMapping("/isTrue") 
	public Boolean isTrue() {
		return true;
	}	

}
