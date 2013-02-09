package acme.data.reverse_doubly;

import org.junit.Before;

import acme.data.reverse_doubly.RecursiveReverser;

public class RecursiveReverserTest extends AbstractReverserTest {

	@Override
	@Before
	public void setup() {
		super.setup();
		reverser = new RecursiveReverser();
	}

}
