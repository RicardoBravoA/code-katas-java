package acme.reverse.list.doubly;

import org.junit.Before;

import acme.reverse.list.doubly.IterativeReverser;

public class IterativeReverserTest extends AbstractReverserTest {

	@Override
	@Before
	public void setup() {
		super.setup();
		reverser = new IterativeReverser();
	}

}
