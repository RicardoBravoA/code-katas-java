package acme.strings.reverse;

import org.junit.Before;

import acme.strings.reverse.JdkReverser;

public class JdkReverserTest extends AbstractReverserTest {

	@Override
	@Before
	public void setup() {
		reverser = new JdkReverser();
	}

}
