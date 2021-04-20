package second.pkg;

import programs.java.day1.TestC;
import programs.java.day1.TestD;

public class TestA {
	private static int Aa = 10;
	static int Ab = 20;
	protected static int Ac = 30;
	public static int Ad = 40;
	
	public static void main(String args[]) {

		System.out.println("Aa = " + TestA.Aa);
		System.out.println("Ab = " + TestA.Ab);
		System.out.println("Ac = " + TestA.Ac);
		System.out.println("Ad = " + TestA.Ad);
		
		//System.out.println("Ba = " + TestB.Ba);
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
