package programs.java.day1;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = {7,9,112,59,70,8,2};
		int index=0;
		Scanner scan = new Scanner(System.in); 
    	System.out.println("Enter the number to search");
    	int ser = scan.nextInt();
    	for (int i=0;i<arr.length;i++) {
    		if (arr[i] == ser) {
    			index = i;
    		}
    	}
    	System.out.println("index = " + index);
		
	}

}
