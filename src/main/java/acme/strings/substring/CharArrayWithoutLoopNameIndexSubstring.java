package acme.strings.substring;

public class CharArrayWithoutLoopNameIndexSubstring {

	public int find (String hay, String needle) {
		if (hay == null || needle == null || needle.length() > hay.length()) {
			return -1;
		}

		for (int i = 0; i < hay.length() - needle.length(); i++) {

			int j = 0;
			while (j < needle.length() && hay.charAt(i + j) ==  needle.charAt(j)) {
				j++;
			}
			if (j == needle.length() ) {
				return i;
			} else {
				i = i + j;
			}

		}

		return -1;

	}

}
