package acme.recursion.oddeven;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class RecursiveIsEvenTest {

	RecursiveIsEven recursiveIsEven;

	@Before
	public void setup() {
		recursiveIsEven = new RecursiveIsEven();
	}

	@Test
	public void zeroIsEven() {
		assertTrue(recursiveIsEven.isEven(0));
	}

	@Test
	public void oneIsOdd() {
		assertFalse(recursiveIsEven.isEven(1));
	}

	@Test
	public void twoIsEven() {
		assertTrue(recursiveIsEven.isEven(2));
	}

}
