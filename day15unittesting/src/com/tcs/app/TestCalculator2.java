package com.tcs.app;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator2 {
//TDD
	
	@Test
	public void testCalculator2() {
	
			int actual=calculator.add(10,10);
			boolean expected=true;
			int expected=20;
			assertEquals(expected,actual);
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeClass
	public void setUp() throws Exception {
		System.out.println("Before Class()");
		
	}

	@AfterEach
	public void tearDown() throws Exception {
		System.out.println("After Class()");	
	}

	
	}

}
