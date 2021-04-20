package programs.java.day1;

public class OuterClass {
	
	void outerMethod() {
		System.out.println("inside outer method");
		
		class inner {
			inner() {
				System.out.println("in constructor");
			}
			void innerMethod() {
				System.out.println("Inside Inner Method");
				f();
			}
		}
		
		}
	public void f() {
		System.out.println("Inside the f method");
	}
	public static void main(String[] args) {
		
	}

}
