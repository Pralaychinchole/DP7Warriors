package com.arraylab;

public class MaximumFrequency {

	static void maximumfreq(int ar[]) {
		int element = 0;
		int maxfreq=0;
		boolean visited;
		for (int i = 0; i < ar.length; i++) {
			int count = 1;
			visited = false;

			for (int j = i - 1; j > 0; j--) {
				if (ar[i] == ar[j]) {
					visited = true;
					break;
				}

			}

			if (visited == false) {

				for (int k = i + 1; k < ar.length; k++) {
					if (ar[i] == ar[k]) {
						count++;
					}

				}
				
			
					System.out.println(ar[i] + "----------->" + count);
			}
            
			if (count>maxfreq)
			{
				maxfreq=count;
				element=ar[i];
				
			}
		
		}
		System.out.println("maximumfrequency "+element+"--->"+maxfreq);
		
	}

	public static void main(String[] args) {

		int ar[] = { 1, 2, 3, 4, 5, 3, 4, 3, 2,2,2,2 };

		maximumfreq(ar);

	}

}
