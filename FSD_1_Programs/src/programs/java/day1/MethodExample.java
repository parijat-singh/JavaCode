package programs.java.day1;

public class MethodExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = minFunction(x,y);
		System.out.println("minimum of 2 = " + z);
		
	}
	// min Function
	public static int minFunction(int a, int b) {
		int min;
		if (a < b)
			min = a;
		else
			min = b;
		return min;
	}
}
