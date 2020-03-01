import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void testComputeCircleAreaFor10() {
		Calculator calculator = new Calculator();
		double expectedValue = 314.1592653589793;
		assertEquals(expectedValue, calculator.computeCircleArea(10), "area for radius 10 is not correct");
	}
	
	@Test
	public void testFizzBuzz1() {
		Calculator newCal = new Calculator();
		assertEquals("1", newCal.getFizzbuzz(1));
		
	}
	
	@Test
	public void testFizzBuzz2() {
		Calculator newCal = new Calculator();
		assertEquals("2", newCal.getFizzbuzz(2));
	}
	
	@Test
	public void testFizzBuzz3() {
		Calculator newCal = new Calculator();
		assertEquals("Fizz", newCal.getFizzbuzz(3));
	}
	@Test
	public void testFizzBuzz5() {
		Calculator newCal = new Calculator();
		assertEquals("Buzz", newCal.getFizzbuzz(5));
	}
	@Test
	public void testFizzBuzz15() {
		Calculator newCal = new Calculator();
		assertEquals("FizzBuzz", newCal.getFizzbuzz(15));
	}
}
