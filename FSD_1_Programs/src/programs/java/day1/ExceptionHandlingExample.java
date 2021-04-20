package programs.java.day1;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		int num1, num2, num3;
		num1 =20;
		num2 = 2;
		try {
			num3 = num1/num2;
			System.out.println("Dvision result =" + num3);
			int z[] = new int[5];
			z[6] = 5;
		}
		catch(ArithmeticException a) {
			System.out.println(a);
			
		}
		catch(Exception b) {
			System.out.println("Before Subclass exception");
		}
		finally {
			System.out.println("This is in finally block");
		}
		System.out.println("Normal flow");
	}

}
