package programs.java.day1;

public class ArrayTest {
	public static void main(String[] args) {
		double myList[] = {1.2,2.4,3.5,4.3,5.6};
		
		//print all array elements
		for (int i=0; i < myList.length; i++) {
			System.out.println(myList[i]);
		}
		
		//sum all elements
		double sum = 0;
		for (int i=0; i < myList.length; i++) {
			sum += myList[i];
		}
		System.out.println("Sum = " + sum);
		
		// find max
		
		double max = myList[0];
		for (int i=1; i < myList.length; i++) {
			if (myList[i] > max) max = myList[i];
		}
		System.out.println("Max = " + max);
		
		
	}

}
