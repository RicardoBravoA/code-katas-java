package acme.strings.reverse;

import acme.api.Reverser;

public class ArraySwappingReverser implements Reverser<String> {

	@Override
	public String reverse(String s) {

		if (s == null || s.length() == 1) {
			return s;
		}

		char[] c = s.toCharArray();
		int l = c.length;
		char swap;

		for (int i = 0; i < l / 2; i++) {
			swap = c[i];
			c[i] = c[l - i];
			c[l - i] = swap;
		}

		return new String(c);

	}

}
