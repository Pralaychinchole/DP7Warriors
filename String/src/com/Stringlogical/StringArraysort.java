package com.Stringlogical;

import java.util.Arrays;

public class StringArraysort {

	static void sortLexo(String st[]) {
		for (int i = 0; i < st.length; i++) {
			for (int j = i + 1; j < st.length; j++) {
				if (st[i].compareTo(st[j]) > 0) {
					String temp = st[i];
					st[i] = st[j];
					st[j] = temp;

				}

			}

		}

	}
	
	

	public static void main(String[] args) {

		String str[] = { "java", "c", "angular", "python", "c++" };

		System.out.println("before sort :" + Arrays.toString(str));

		sortLexo(str);

		System.out.println("after sort:" + Arrays.toString(str));

	}

}
