package com.acme.reverse.string;

import com.acme.reverse.api.Reverser;

public class JdkReverser implements Reverser<String> {
	public String reverse(final String str) {
		if ((null == str) || (str.length() <= 1)) {
			return str;
		}
		return new StringBuffer(str).reverse().toString();
	}
}