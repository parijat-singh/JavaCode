package programs.java.inheritance;

public class Programmer extends Employee {
	int bonus = 10000;
	
	public void show() {
		super.show();
		System.out.println("inside child show...");
	}

}
