package test.generation.math;

import static org.junit.jupiter.api.Assertions.*;

import org.generation.math.MathOperations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathOperationTest {

	MathOperations op;

	@BeforeEach
	void setUp() {
		op = new MathOperations(10);
	}
	
	@Test
	@DisplayName("Sumatoria de números")
	void additionTest() {
		assertEquals( 15, op.addition(5) );
		assertEquals( 30, op.addition(15) );
		assertEquals( 130, op.addition(100) );
		assertEquals( 110, op.addition(-20) );
	}
	
	//Pruebas unitarias con la resta
	@Test
	@DisplayName("Resta de números")
	void substractionTest() {
		assertEquals( 15, op.substraction(-5) );
		assertEquals( 13, op.substraction(2) );
		assertEquals( 7, op.substraction(6) );
		assertEquals( 2, op.substraction(5) );
		assertEquals( -1, op.substraction(3) );
	}
	
	@Test
	void substractionDecimalTest() {
		final double DELTA=0.001;
		assertEquals(9.9, op.substraction(.1),DELTA);
		assertEquals(9.7, op.substraction(.2), DELTA);
		assertEquals(9.4, op.substraction(.3), DELTA);
		assertEquals(9.0, op.substraction(.4), DELTA);
	}
	
}
