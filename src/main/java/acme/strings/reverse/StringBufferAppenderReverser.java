package acme.strings.reverse;

import acme.api.Reverser;

public class StringBufferAppenderReverser implements Reverser<String> {

	public String reverse(final String str) {
		if ((null == str) || (str.length() <= 1)) {
			return str;
		}
		final StringBuffer reverse = new StringBuffer(str.length());
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse.append(str.charAt(i));
		}
		return reverse.toString();
	}

}
