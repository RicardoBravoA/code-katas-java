package acme.strings.reverse;

import org.junit.Before;

import acme.strings.reverse.RecursionReverser;

public class RecursiveReverserTest extends AbstractReverserTest {

	@Override
	@Before
	public void setup() {
		reverser = new RecursionReverser();
	}

}
