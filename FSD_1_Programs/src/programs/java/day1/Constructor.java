package programs.java.day1;

public class Constructor {
	int a;
	int b;
	public Constructor() {
		a = 10;
		b = 20;
		System.out.println("Inside default constructor");
	}
	public Constructor(int j, int k) {
		a = j;
		b = k;
		System.out.println("Inside parameterized constructor");
	}
	public void salary() {
		System.out.println("a = " + a + " b = " + b);
	}
	public static void main(String[] args) {
		Constructor ob1 = new Constructor();
		Constructor ob2 = new Constructor(30,40);
		ob1.salary();
		ob2.salary();
	}
}
