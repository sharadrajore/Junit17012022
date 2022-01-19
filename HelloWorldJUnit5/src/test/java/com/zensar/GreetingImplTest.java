package com.zensar;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class GreetingImplTest {

	Greeting greetImpl;

	@BeforeAll
	public static void beforeEveryThing() {
		System.out.println("Inside beforeEveryThing");
	}

	@BeforeEach
	public void setup() {
		greetImpl = new GreetingImpl();
		System.out.println("Inside setup method");
	}

	@Test
	public void greetShouldReturnValidOutput() {

		String name = greetImpl.greet("Sharad");
		Assertions.assertEquals("Hello Sharad", name);
	}

	// expected = IllegalArgumentException.class
	@Test
	public void greetShouldThrowAnException() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			greetImpl.greet(null);
		}

		);

	}

	@Test
	public void greetShouldThrowAnExceptionForBlank() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			greetImpl.greet("");
		});
	}

	// @Ignore
	@Disabled
	// @Test(expected = IllegalArgumentException.class)
	public void test() {
		greetImpl.greet("");
	}

	@AfterEach
	public void tearDown() {
		greetImpl = null;
		System.out.println("Inside tearDown method");
	}

	@AfterAll
	public static void afterEveryThing() {
		System.out.println("Inside beforeEveryThing");
	}

}
