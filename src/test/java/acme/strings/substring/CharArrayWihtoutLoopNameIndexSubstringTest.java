package acme.strings.substring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharArrayWihtoutLoopNameIndexSubstringTest {

	@Test
	public void findSubstring() {
		CharArrayWithoutLoopNameIndexSubstring finder = new CharArrayWithoutLoopNameIndexSubstring();
		assertEquals(1, finder.find("hallo", "all"));
	}

	@Test
	public void needleDoesNotExist() {
		CharArrayWithoutLoopNameIndexSubstring finder = new CharArrayWithoutLoopNameIndexSubstring();
		assertEquals(-1, finder.find("hallo", "foo"));
	}
}
