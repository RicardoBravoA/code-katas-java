package acme.strings.reverse;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import acme.api.Reverser;

public abstract class AbstractReverserTest {

	protected Reverser<String> reverser;

	@Before
	public abstract void setup();

	public void reverse(final String original, final Reverser<String> reverser) {
		assertEquals(original, reverser.reverse((reverser.reverse(original))));
	}

	@Test
	public void nullString() {
		reverse(null, reverser);
	}

	@Test
	public void oneCharacter() {
		reverse("a", reverser);
	}

	@Test
	public void fourCharacters() {
		reverse("abcd", reverser);
	}

	@Test
	public void twoCharacters() {
		reverse("abcd", reverser);
	}

	@Test
	public void oddCharacters() {
		reverse("abc", reverser);
	}

}
