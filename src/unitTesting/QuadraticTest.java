package unitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuadraticTest {

	@Test
	void testNoRealRoot() {
		
		Double a=1.0,b=1.0,c=1.0;
		QuadraticEquastionCalculator calculator= new QuadraticEquastionCalculator();
		calculator.calculate(a, b, c);
	}
	@Test
	void testOneRealRoot() {
		
		Double a=1.0,b=2.0,c=1.0;
		QuadraticEquastionCalculator calculator= new QuadraticEquastionCalculator();
		calculator.calculate(a, b, c);
	}
	@Test
	void testTwoRealRoot() {
		
		Double a=1.0,b=5.0,c=2.0;
		QuadraticEquastionCalculator calculator= new QuadraticEquastionCalculator();
		calculator.calculate(a, b, c);
	}

}

