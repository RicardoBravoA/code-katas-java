package acme.data.reverse_doubly;

import org.junit.Before;

import acme.data.reverse_doubly.IterativeReverser;

public class IterativeReverserTest extends AbstractReverserTest {

	@Override
	@Before
	public void setup() {
		super.setup();
		reverser = new IterativeReverser();
	}

}
