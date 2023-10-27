package com.String;

public class AverageInString {

	static void avrg(String st) {
		int sum = 0;
		int avg = 0;
		int count = 0;

		char ch[] = st.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 48 && ch[i] <= 57) {

				sum += ch[i]-48;
				count++;
				avg = sum / count;

			}                 //using ascii value

		}
		System.out.println(avg);
	}

	public static void main(String[] args) {

		String st = "pralay12345k";

		avrg(st);
	}

}
