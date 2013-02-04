package com.acme.reverse.list.doubly;

import org.junit.Before;

public class RecursiveReverserTest extends AbstractReverserTest {

	@Override
	@Before
	public void setup() {
		super.setup();
		reverser = new RecursiveReverser();
	}

}
