package acme.reverse.string;

import acme.reverse.api.Reverser;

public class StringBufferInPlaceReverser implements Reverser<String> {

	public String reverse(final String str) {
		if ((null == str) || (str.length() <= 1)) {
			return str;
		}
		final StringBuffer result = new StringBuffer(str);
		for (int i = 0; i < (str.length() / 2); i++) {
			final int swapIndex = str.length() - 1 - i;
			final char swap = result.charAt(swapIndex);
			result.setCharAt(swapIndex, result.charAt(i));
			result.setCharAt(i, swap);
		}
		return result.toString();
	}

}
