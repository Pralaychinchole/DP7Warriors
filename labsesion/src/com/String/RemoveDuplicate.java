package com.String;

public class RemoveDuplicate {

	static String remduplicate(String str) {
		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = '\0';

				}

			}
			if (ch[i] != '\0') {

				System.out.print(ch[i]);
			}

		}
		return str;

	}

	public static void main(String[] args) {

		String str = "hello";

		remduplicate(str);

	}

}
