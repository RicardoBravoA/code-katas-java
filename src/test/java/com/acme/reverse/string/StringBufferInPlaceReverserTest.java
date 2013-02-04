package com.acme.reverse.string;

import org.junit.Before;

import com.acme.reverse.string.StringBufferInPlaceReverser;

public class StringBufferInPlaceReverserTest extends AbstractReverserTest {

	@Override
	@Before
	public void setup() {
		reverser = new StringBufferInPlaceReverser();
	}

}
