package acme.reverse.string;

import org.junit.Before;

import acme.reverse.string.RecursionReverser;

public class RecursiveReverserTest extends AbstractReverserTest {

	@Override
	@Before
	public void setup() {
		reverser = new RecursionReverser();
	}

}
