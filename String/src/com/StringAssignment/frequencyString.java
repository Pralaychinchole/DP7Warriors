package com.StringAssignment;

public class frequencyString {

	static void findfreq(String str) {
		char ch[] = str.toCharArray();

		int count;

		boolean visited;

		for (int i = 0; i < ch.length-1; i++) {
			count = 1;
			visited = false;

			for (int j = i - 1; j >= 0; j--) {

				if (ch[i] == ch[j]) {
					visited = true;
					
				}

			}
			if (visited = false) {
				for (int k = i + 1; k < ch.length; k++) {
					if (ch[i] == ch[k]) 
					{
						count++;
					}

				}
				System.out.println(ch[i] + "-->" + count);
			}

		}
	}

	public static void main(String[] args) {

		String str = "hello";

		findfreq(str);
		
		

	}

}
