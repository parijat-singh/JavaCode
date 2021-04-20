package programs.java.day1;
import java.util.*;

public class stackDemo {
	public static void main(String[] args) {
		
		Stack s1 = new Stack();
		Stack<String> s2 = new Stack<String>();
		
		s1.push(4);
		s1.push("Geeks");
		s1.push("God");
		
		System.out.println("Index of Geeks " + s1.indexOf("Geeks"));
		System.out.println("position of Geeks " + s1.search("Geeks"));
		System.out.println("top of Stack s1 " + s1.peek());
		
		s2.push("abc");
		s2.push("def");
		s2.push("zxc");
		
		System.out.println("Stack 1 = " + s1);
		System.out.println("Stack 2 = " + s2);
		
		System.out.println("Popping 1 element of s1 " + s1.pop());
		System.out.println("Popping 1 element of s2 " + s2.pop());
		
		System.out.println("Stack 1 = " + s1);
		System.out.println("Stack 2 = " + s2);
		
		
		
		
		
	}

}
