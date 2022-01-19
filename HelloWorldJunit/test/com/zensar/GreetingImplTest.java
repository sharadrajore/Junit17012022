package com.zensar;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class GreetingImplTest {
	
	Greeting greetImpl;
	
	@BeforeClass
	public static void beforeEveryThing() {
		System.out.println("Inside beforeEveryThing");
	}
	
	
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
	
	
	@Ignore
	@Test(expected = IllegalArgumentException.class)
	public void test() {
		greetImpl.greet("");
	}
	
	

	@After
	public void tearDown() {
		greetImpl =null;
		System.out.println("Inside tearDown method");
	}
	
	@AfterClass
	public static void afterEveryThing() {
		System.out.println("Inside beforeEveryThing");
	}
	
	
	
	
	

}
