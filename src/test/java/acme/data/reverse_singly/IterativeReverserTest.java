package acme.data.reverse_singly;

import org.junit.Before;

import acme.data.reverse_singly.IterativeReverser;

public class IterativeReverserTest extends AbstractReverserTest {

	@Override
	@Before
	public void setup() {
		super.setup();
		reverser = new IterativeReverser();
	}

}
