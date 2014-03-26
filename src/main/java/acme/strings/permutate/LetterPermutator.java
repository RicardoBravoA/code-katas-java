package acme.strings.permutate;

import java.util.LinkedList;
import java.util.List;

public class LetterPermutator {

	/**
	 * Return all possible permutations of the characters of a word
	 */
	public List<String> permutate(String word) {
		List<String> l = new LinkedList<>();
		permutate("", word, l);

		return l;
	}

	private void permutate(String prefix, String word, List<String> acc) {
		int length = word.length();
		if (length == 0) {
			acc.add(prefix);
		} else {
			for (int i = 0; i < length; i++) {
				permutate(prefix + word.charAt(i),
						word.substring(0, i) + word.substring(i + 1, length),
						acc);
			}
		}

	}
}
