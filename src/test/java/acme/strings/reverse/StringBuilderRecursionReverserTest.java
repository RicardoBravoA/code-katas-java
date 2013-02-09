package acme.strings.reverse;

import org.junit.Before;

import acme.strings.reverse.StringBuilderRecursionReverser;

public class StringBuilderRecursionReverserTest extends AbstractReverserTest {

	@Override
	@Before
	public void setup() {
		reverser = new StringBuilderRecursionReverser();
	}

}
