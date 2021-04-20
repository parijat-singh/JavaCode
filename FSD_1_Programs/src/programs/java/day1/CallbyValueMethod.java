package programs.java.day1;

public class CallbyValueMethod {
	// min Function
		public static int minFunction(int a, int b) {
			int min;
			if (a < b)
				min = a;
			else
				min = b;
			return min;
		}
		public static void main(String[] args) {
			CallbyValueMethod d = new CallbyValueMethod();
			int c = d.minFunction(10,20);
			System.out.println("minimum Value is " + c);
			int e = minFunction(30,40);
			System.out.println("minimum Value is " + e);
		}
}
