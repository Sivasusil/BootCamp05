package org.devops.controller;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.bind.annotation.GetMapping;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CalculationControllerTest {
	
	@Test
	public void testAdd() {
		CalculationController ms = new CalculationController();		
		Assertions.assertEquals(ms.add(), "Sum of 20 + 30 : 50");
	}

	@Test
	public void testSubtract() {
		CalculationController ms = new CalculationController();		
		Assertions.assertEquals(ms.subtract(), "Subtract of 30 - 20 : 10");
	}

	@Test
	public void testDivision() {
		CalculationController ms = new CalculationController();		
		Assertions.assertEquals(ms.division(), "Division of 6/2 : "+ (6/2));
	}

	@Test
	public void testReminder() {
		CalculationController ms = new CalculationController();		
		Assertions.assertEquals(ms.reminder(), "Reminder of 6%2 : "+ (6%2));
	}
	
	//return "I AM A CALCULATOR";
	@Test
	public void testShowcase() {
		CalculationController ms = new CalculationController();		
		Assertions.assertEquals(ms.showcase(), "I AM A CALCULATOR");
	}

	@Test
	public void testIsTrue() {
		CalculationController ms = new CalculationController();		
		Assertions.assertEquals(ms.isTrue(), true);		
	}
	
	@Test
	public void testNull(){
		
		CalculationController ms = new CalculationController();	
		Assertions.assertNotNull(ms.add());
		
	}

	@Test
	public void testTrue(){
		CalculationController ms = new CalculationController();	
		Assertions.assertTrue(ms.isTrue());
	}
	
	@Test
	public void testDivisionNotSame(){
		CalculationController ms = new CalculationController();	
		Assertions.assertNotSame(ms.division(), "25", " Not equal to 25");
	}
	
	@Test
	public void testHello(){
		MessageController ms = new MessageController();
		Assertions.assertNotEquals(ms.sayHello(), "Bye");
	}
}
