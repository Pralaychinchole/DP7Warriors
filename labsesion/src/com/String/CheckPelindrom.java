package com.String;

import java.util.Scanner;

public class CheckPelindrom {

	static void chepalindrome(String st) {
		char ch[] = st.toCharArray();

		boolean Status = true;

		for (int i = 0,j=ch.length-1; i < ch.length/2; i++,j--) {
			
				if (ch[i] != ch[j]) {
					Status = false;
					break;
				}

			}

		

		if (Status == true) {

			System.out.println("the String is palindrome");
		} else {
			System.out.println("the String is not palindrome");

		}

	}

	public static void main(String[] args) {

		String st = "hello";

		chepalindrome(st);

	}

}
