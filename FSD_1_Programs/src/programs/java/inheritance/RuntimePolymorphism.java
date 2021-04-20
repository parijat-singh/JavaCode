package programs.java.inheritance;

class Bank {
	int a = 10;
	float getinterest() {
		return 0;
	}
}

class SBI extends Bank {
	int a = 9;
	float getinterest() {
		return 8.7f;
	}
}

class ICICI extends Bank {
	int a = 11;
	float getinterest() {
		return 9.7f;
	}
}

public class RuntimePolymorphism {
	public static void main(String args[]) {
		Bank b;
		b = new SBI();
		System.out.println("Interest of SBI = " + b.getinterest());
		System.out.println("value of a = " + b.a);
		
		b = new ICICI();
		System.out.println("Interest of ICICI = " + b.getinterest());
		
		b = (SBI)b;
		System.out.println("value of a = " + b.a);
		
		
			
	}

}