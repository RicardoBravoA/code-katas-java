package acme.strings.reverse;

import acme.api.Reverser;

public class ArraySwappingReverser implements Reverser<String> {

	public String reverse(final String str) {
		if ((null == str) || (str.length() <= 1)) {
			return str;
		}
		final char[] chars = str.toCharArray();
		int right = chars.length - 1;
		for (int left = 0; left < right; left++) {
			final char swap = chars[left];
			chars[left] = chars[right];
			chars[right--] = swap;
		}
		return new String(chars);
	}

}
