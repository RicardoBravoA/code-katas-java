package acme.strings.reverse;

import acme.api.Reverser;

public class StringBuilderRecursionReverser implements Reverser<String> {

	public String reverse(final String t) {
		if ((null == t) || (t.length() <= 1)) {
			return t;
		}
		final String result = reverseRecursively(t, 0, new StringBuilder());
		return result;
	}

	public String reverseRecursively(final String s, final int pos,
			final StringBuilder sb) {
		sb.append(s.charAt(s.length() - pos - 1));
		if (pos != s.length() - 1) {
			reverseRecursively(s, pos + 1, sb);
		}

		return sb.toString();
	}

}
