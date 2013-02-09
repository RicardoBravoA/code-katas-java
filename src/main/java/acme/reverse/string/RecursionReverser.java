package acme.reverse.string;

import acme.reverse.api.Reverser;

public class RecursionReverser implements Reverser<String> {

	@Override
	public String reverse(final String str) {
		if ((null == str) || (str.length() <= 1)) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}

}
