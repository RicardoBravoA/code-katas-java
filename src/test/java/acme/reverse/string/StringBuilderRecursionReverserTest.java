package acme.reverse.string;

import org.junit.Before;

import acme.reverse.string.StringBuilderRecursionReverser;

public class StringBuilderRecursionReverserTest extends AbstractReverserTest {

	@Override
	@Before
	public void setup() {
		reverser = new StringBuilderRecursionReverser();
	}

}
