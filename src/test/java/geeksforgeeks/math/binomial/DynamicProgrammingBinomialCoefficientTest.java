package geeksforgeeks.math.binomial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DynamicProgrammingBinomialCoefficientTest {

	DynamicProgrammingBinomialCoefficient coefficient = new DynamicProgrammingBinomialCoefficient();

	@Test
	public void binomialOf_1_1() {
		assertEquals(1, coefficient.binomialCoefficient(1, 1));
	}

	@Test
	public void binomialOf_5_3() {
		assertEquals(10, coefficient.binomialCoefficient(5, 3));
	}

	@Test
	public void binomialOf_30_18() {
		assertEquals(86493225, coefficient.binomialCoefficient(30, 18));
	}

}
