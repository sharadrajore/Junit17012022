package com.zensar;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {
	
	Greeting greetImpl;
	
	@Before
	public void setup() {
		greetImpl =new GreetingImpl();
		System.out.println("Inside setup method");
	}
	
	

	@Test
	public void greetShouldReturnValidOutput() {
		
		String name = greetImpl.greet("Sharad");		
		assertEquals("Hello Sharad", name);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowAnException() {
		greetImpl.greet(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowAnExceptionForBlank() {
		greetImpl.greet("");
	}
	
	

	@After
	public void tearDown() {
		greetImpl =null;
		System.out.println("Inside tearDown method");
	}
	
	
	
	
	
	

}
