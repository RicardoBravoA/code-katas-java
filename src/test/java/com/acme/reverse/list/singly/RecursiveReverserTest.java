package com.acme.reverse.list.singly;

import org.junit.Before;

import com.acme.reverse.list.singly.RecursiveReverser;

public class RecursiveReverserTest extends AbstractReverserTest {

	@Override
	@Before
	public void setup() {
		super.setup();
		reverser = new RecursiveReverser();
	}

}
