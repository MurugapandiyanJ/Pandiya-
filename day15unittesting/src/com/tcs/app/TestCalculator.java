package com.tcs.app;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculator {
//TDD
	

@Test
public void testAdd2() {
		Calculatorapp calculator=new Calculator();
		int actual=calculator.add(10,10);
		boolean expected=true;
		int expected1=20;
		assertEquals(expected1,actual);
}

@






		
	}



