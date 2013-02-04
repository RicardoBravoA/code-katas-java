package com.acme.reverse.string;

import org.junit.Before;

import com.acme.reverse.string.StringBufferAppenderReverser;

public class StringBufferAppenderReverserTest extends AbstractReverserTest {

	@Override
	@Before
	public void setup() {
		reverser = new StringBufferAppenderReverser();
	}

}
