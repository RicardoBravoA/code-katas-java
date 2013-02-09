package acme.strings.reverse;

import org.junit.Before;

import acme.strings.reverse.StringBufferInPlaceReverser;

public class StringBufferInPlaceReverserTest extends AbstractReverserTest {

	@Override
	@Before
	public void setup() {
		reverser = new StringBufferInPlaceReverser();
	}

}
