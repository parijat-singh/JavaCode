package programs.java.day1;

public class TypeCast {
	public static void main(String args[]) {
        
		int a = 200;
		long b = 2000008976;
		int c = (int) b;
		System.out.println("Value of c = " + c);
		char d = (char) a;
		System.out.println("Value of d = " + d);
		
		double d1 = 190.0012345678932;
		float f = (float) d1;
		System.out.println("Value of f = " + f);
		
		byte bb;
		int ii = 257;
		double dd = 257.142;
		
		bb = (byte) ii;
		System.out.println("int = " + ii + " byte = " + bb);
		
		bb = (byte) dd;
		System.out.println("double = " + dd + " byte = " + bb);
    }

}
