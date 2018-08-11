package com.kennethindustry.learn;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class SuperSecretCalculationTest {
	
	SuperSecretCalculation ssc;

	@Before
	public void setUp() throws Exception {
		ssc = new SuperSecretCalculation();
	}

	@Test
	public void testCalculation() {
		double initialVlaue = 1.1;
		
		BigDecimal expectedValue = BigDecimal.valueOf(initialVlaue * 100/Math.PI);
		
		assertTrue("testCalculation", expectedValue.equals(ssc.calculation(initialVlaue)));
	}

}
