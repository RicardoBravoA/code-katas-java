package acme.strings.permutate;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class LetterPermutatorTest {

	@Test
	public void test() {
		LetterPermutator letterPermutator = new LetterPermutator();

		List<String> expected = new LinkedList<>();
		expected.add("abc");
		expected.add("acb");
		expected.add("bac");
		expected.add("bca");
		expected.add("cab");
		expected.add("cba");

		assertEquals(expected, letterPermutator.permutate("abc"));

	}

}
