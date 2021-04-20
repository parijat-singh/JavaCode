package programs.java.day1;

public class ArrayRotation {
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		
		int n = 2;
		
		//print all array elements
		for (int i=0; i < arr1.length; i++) {
					System.out.print(arr1[i]);
		}
		System.out.println();
		for (int i=0; i<n; i++) {
			int last;
			last = arr1[arr1.length -1];
			for (int j = arr1.length -1; j > 0; j--) {
				arr1[j] = arr1[j-1];
			}
			arr1[0] = last;
		}
		//print all array elements
		for (int i=0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
	

}
