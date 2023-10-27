package com.words;

public class FirstAlphabetCapital {

	static void FirstCapital(String str) {
		String s[] = str.split("\\s");

		System.out.println(s.length);
		for (int i = 0; i < s.length; i++) {

			char ch[] = s[i].toCharArray();

			for (int j = 0; j < ch.length; j++) {

				if (j == 0) {
					ch[j] -=32 ;

				}

				System.out.print(ch[j]);
			}
			
			System.out.print(" ");
			
		}
          
	}

	public static void main(String[] args) {

		String str = "india is beautiful country";

		FirstCapital(str);
	}

}
