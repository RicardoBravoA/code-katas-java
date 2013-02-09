package acme.reverse.string;

import org.junit.Before;

import acme.reverse.string.JdkReverser;

public class JdkReverserTest extends AbstractReverserTest {

	@Override
	@Before
	public void setup() {
		reverser = new JdkReverser();
	}

}
