package acme.strings.reverse;

import org.junit.Before;

import acme.strings.reverse.StringBufferAppenderReverser;

public class StringBufferAppenderReverserTest extends AbstractReverserTest {

	@Override
	@Before
	public void setup() {
		reverser = new StringBufferAppenderReverser();
	}

}
