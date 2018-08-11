package com.kennethindustry.learn;

import java.math.BigDecimal;

public class SuperSecretCalculation {
	
	// multiply by 100 and divide the result by PI
	public BigDecimal calculation(double operand) {
		BigDecimal bd = BigDecimal.valueOf(operand * 100/Math.PI);;
		
		return bd;
	}

}
