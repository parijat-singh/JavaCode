package programs.java.day1;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {7,9,112,115,170,188,1232};
		int key = 170;
		
		int arrlength = arr.length - 1;
		
		binarySearch(arr,key,arrlength);	
	}
	
	public static void binarySearch(int[] arr, int key, int length) {
		int start = 0;
		int midVal = (start + length)/2;
		
		while (start <= length) {
			if (arr[midVal] < key) {
				start = midVal + 1;
			} else if (midVal == start) {
				System.out.println("Element found at index " + midVal);
			} else {
				start = midVal - 1;
			}
		}
		
	}
	

}
