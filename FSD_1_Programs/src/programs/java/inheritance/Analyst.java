package programs.java.inheritance;

public class Analyst extends Employee {
	int bonus = 20000;
	
	public void show() {
		super.show();
		System.out.println("inside Analyst child show...");
	}

}
