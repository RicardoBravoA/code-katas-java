package geeksforgeeks.dp.matrixchain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class IterativeMatrixChainMultiplicationTest {

	private MatrixChainMultiplication matrixChain;

	@Before
	public void setup() {
		matrixChain = new IterativeMatrixChainMultiplication();
	}

	@Test
	public void test1() {
		assertEquals(6000,
				matrixChain.matrixChainOrder(new int[] { 10, 20, 30 }));
	}

	@Test
	public void test2() {
		assertEquals(26000,
				matrixChain.matrixChainOrder(new int[] { 40, 20, 30, 10, 30 }));
	}

	@Test
	public void test3() {
		assertEquals(30000,
				matrixChain.matrixChainOrder(new int[] { 10, 20, 30, 40, 30 }));
	}

}
