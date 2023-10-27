package com.words;

public class UniqElement {

	static void uniqname(String str1[], String str2[]) {
		boolean found;

		for (String s : str2) {

			found = false;

			for (String si : str1) {
				if (s.equals(si)) {
					found = true;
					break;
				}

			}

			if (!found) {
				System.out.println(s);
			}
		}

	}

	public static void main(String[] args) {

		String str1[] = { "pralay", "shivam", "hrushi", "Aniket" };
		String str2[] = { "pralay", "suraj", "Aniket", "kailas" };

		uniqname(str1, str2);

	}

}
