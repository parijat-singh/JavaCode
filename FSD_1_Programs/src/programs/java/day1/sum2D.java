package programs.java.day1;

public class sum2D {
	public static void main(String[] args) {
		int[][] arr1 = {{10,20},{30,40}};
		int[][] arr2 = {{50,60},{70,80}};
		
		int[][] sumarr = new int[2][2];
		
		for (int r=0; r < arr1.length; r++) {
			for (int c = 0; c< arr1[0].length; c++) {
				sumarr[r][c] = arr1[r][c] + arr2[r][c];
			}
		}
		
		//print array 1
		System.out.println("Array 1");
		for (int r=0; r < sumarr.length; r++) {
			for (int c = 0; c< arr1[0].length; c++) {
				System.out.format("%d \t", arr1[r][c]);
			}
			System.out.println("");
		}
		//print array 2
		System.out.println("Array 2");
		for (int r=0; r < arr2.length; r++) {
			for (int c = 0; c< arr2[0].length; c++) {
				System.out.format("%d \t", arr2[r][c]);
			}
			System.out.println("");
		}
		
		//print sum array
		System.out.println("Sum array");
		for (int r=0; r < sumarr.length; r++) {
			for (int c = 0; c< sumarr[0].length; c++) {
				System.out.format("%d \t", sumarr[r][c]);
			}
			System.out.println("");
		}
		
	}

}
