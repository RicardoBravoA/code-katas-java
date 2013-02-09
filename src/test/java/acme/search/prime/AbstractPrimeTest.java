package acme.search.prime;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import acme.search.prime.Prime;

import com.google.common.collect.Lists;

public abstract class AbstractPrimeTest {

	final static List<Integer> PRIMES_TO_HUNDRED = Lists.newArrayList(2, 3, 5,
			7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
			73, 79, 83, 89, 97);

	Prime prime;

	@Before
	public abstract void setup();

	@Test
	public void primesToHundred() {
		assertEquals(PRIMES_TO_HUNDRED, prime.find(100));
	}
}
