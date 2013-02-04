package com.acme.reverse.list.singly;

import org.junit.Before;

import com.acme.reverse.list.singly.IterativeReverser;

public class IterativeReverserTest extends AbstractReverserTest {

	@Override
	@Before
	public void setup() {
		super.setup();
		reverser = new IterativeReverser();
	}

}
