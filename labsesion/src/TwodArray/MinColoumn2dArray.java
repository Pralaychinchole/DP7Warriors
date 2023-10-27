package TwodArray;
//28. WAP to print minimum in columns. Means e.g. arr[][]={{22, 31, 9}, {12, 5, 16}, 
//{34, 42, 2}} output is: 12, 5, 2. 
public class MinColoumn2dArray {

		
static void checkCmin(int ar[][]) {
		
		for (int j = 0; j < 3; j++) {

			int min = Integer.MAX_VALUE;
			for (int i = 0; i < 2; i++) {
				if (ar[i][j] < min) 
				{
                    min=ar[i][j];    
				}
			}
			System.out.println("minimum number in coloumn is " + min);
		}

}

	public static void main(String[] args) {

		int ar[][] = { { 22, 31, 9 }, { 12, 25, 16 } };

		checkCmin(ar);
}
	
}