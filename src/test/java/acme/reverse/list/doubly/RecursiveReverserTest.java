package acme.reverse.list.doubly;

import org.junit.Before;

import acme.reverse.list.doubly.RecursiveReverser;

public class RecursiveReverserTest extends AbstractReverserTest {

	@Override
	@Before
	public void setup() {
		super.setup();
		reverser = new RecursiveReverser();
	}

}
