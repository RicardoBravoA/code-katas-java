package acme.data.reverse_singly;

import org.junit.Before;

import acme.data.reverse_singly.RecursiveReverser;

public class RecursiveReverserTest extends AbstractReverserTest {

	@Override
	@Before
	public void setup() {
		super.setup();
		reverser = new RecursiveReverser();
	}

}
