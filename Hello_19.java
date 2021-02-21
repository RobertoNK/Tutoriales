
public class Hello_19 {
	
	public static void main(String [] args) {
		int [][] arr  = new int [2][2];
		arr[0][0] = 1;
		int [][] arr2 = {{1,2,3},{2,2,2}};
	
		// printing elements
		for (int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[0].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int [] row : arr2) {
			for(int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		
		// sum of rows
		for (int i = 0; i < arr2.length; i++) {
			int sumOfRows = 0;
			for(int j = 0; j < arr2[0].length; j++) {
				sumOfRows = sumOfRows + arr2[i][j];
			}
			System.out.println(sumOfRows);
		}
		
		// sum of columns
		for (int i = 0; i < arr2[0].length; i++) {
			int sumOfCols = 0;
			for(int j = 0; j < arr2.length; j++) {
				sumOfCols = sumOfCols + arr2[j][i];
				
			}
			System.out.println(sumOfCols);
		}
	}
	

}
