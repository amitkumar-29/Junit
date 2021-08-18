package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

Calculator calculator;
@BeforeEach
void init() {
	calculator=new Calculator();
	System.out.println("initt");
}
	@Test
	void testAdd() {
		Calculator calculator=new Calculator();//arrange
		int result=calculator.add(8, 6);//Act
		assertEquals(14,result,"Test failed");
		
	}
	@Test
	void testFloatAdd() {
		//Calculator calculator=new Calculator();//arrange
		float result=calculator.add(2.33F, 3F);//Act
		assertEquals(5.33F,result); //pass test
		//assertEquals(5.3F,result); //fail test

		
	}
	@Test
	void testForNegativeIntegers() {
		//Calculator calculator=new Calculator();//arrange
		int result =calculator.add(-4, 5);
		assertTrue(result>0);

	}
	@Test
	void testDivide() {
		//Calculator calculator=new Calculator();//arrange
		float result=calculator.divide(4, 2);
		assertEquals(2F,result); //pass test

	}
	@Test
	void testDivideByZero() {
		//Calculator calculator=new Calculator();
		boolean flag=false;
		try {
		float result=calculator.divide(1, 0);
		//assertNotEquals(1F,result)
		}
		catch(Exception e) {
			assertNotNull(e);
			assertEquals(ArithmeticException.class,e.getClass());
			flag=true;
		}
		finally {
			
			assertTrue(flag);		}
	}
	

}
