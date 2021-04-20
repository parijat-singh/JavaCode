package second.pkg;

import programs.java.day1.TestC;
import programs.java.day1.TestD;

public class TestB {
	private static int Ba = 50;
	static int Bb = 60;
	protected static int Bc = 70;
	public static int Bd = 80;
	
	public static void main(String args[]) {
		System.out.println("Ba = " + TestB.Ba);
		System.out.println("Bb = " + TestB.Bb);
		System.out.println("Bc = " + TestB.Bc);
		System.out.println("Bd = " + TestB.Bd);
		
		//System.out.println("Ca = " + TestC.Ca); ->> Ca is Private
		//System.out.println("Cb = " + TestC.Cb); ->> Cb is in a different Package 
		//System.out.println("Cc = " + TestC.Cc); ->> Cb is protected
		System.out.println("Cd = " + TestC.Cd);
		
		//System.out.println("Da = " + TestD.Da);
		//System.out.println("Db = " + TestD.Db);
		//System.out.println("Dc = " + TestD.Dc);
		System.out.println("Dd = " + TestD.Dd);
	}

}
