package programs.java.inheritance;

class Employee {
	float salary = 40000;
	
	public void show() {
		System.out.println("inside Parent show..");
	}

	

	public static void main(String args[]) {
		Programmer p = new Programmer();
		
		System.out.println("Salary = " + p.salary);
		System.out.println("Bonus = " + p.bonus);
		p.show();
		
		Analyst a = new Analyst();
		
		System.out.println("Salary = " + a.salary);
		System.out.println("Bonus = " + a.bonus);
		a.show();

	}
}


