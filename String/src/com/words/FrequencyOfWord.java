package com.words;

public class FrequencyOfWord {

	static void freqword(String str) {
		String[] starr = str.split("\\s");
		
		int count;

		for (int i = 0; i < starr.length; i++) {

			if (starr[i].equals("visited"))
				continue;
			count = 1;

			for (int j = i + 1; j < starr.length; j++) {
				if (starr[i].equalsIgnoreCase(starr[j])) {
					count++;
					starr[j] = "visited";

				}

			}
			System.out.println(starr[i] + "--------------->" + count);

		}

	}

	public static void main(String[] args) {

		String str = "welcome to pune to";

		freqword(str);

	}

}
