package acme.strings.substring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharArrayIndexSubstringTest {

	@Test
	public void findSubstring() {
		CharArrayIndexSubstring finder = new CharArrayIndexSubstring();
		assertEquals(1, finder.find("hallo", "all"));
	}

	@Test
	public void needleDoesNotExist() {
		CharArrayIndexSubstring finder = new CharArrayIndexSubstring();
		assertEquals(1, finder.find("hallo", "foo"));
	}
}
