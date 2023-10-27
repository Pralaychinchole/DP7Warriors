package com.words;

public class StringReverse {

	static void reverseString(String str) {
		String revers = " ";

		for (int i = str.length() - 1; i >= 0; i--) {

			revers = revers + str.charAt(i);

		}
		System.out.println("After :" + revers);
	}

	public static void main(String[] args) {

		String str = "i like to java learn";

		System.out.println("before" + str);
		reverseString(str);

	}

}
