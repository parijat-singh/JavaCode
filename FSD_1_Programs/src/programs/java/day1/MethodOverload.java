package programs.java.day1;

public class MethodOverload {
	public void area(int a, int b) {
		System.out.println("Area of rectangle is " + a*b);
	}
	public void area(int a) {
		System.out.println("Area of circle is " + 3.14*a*a);
	}
	public void area(float a, int b) {
		System.out.println("Float = " + a + "Int = " + b);
	}
	
	public static void main(String[] args) {
		MethodOverload ob = new MethodOverload();
		
		ob.area(10);
		ob.area(12f, 4);
		ob.area(10, 12);
	}
}
