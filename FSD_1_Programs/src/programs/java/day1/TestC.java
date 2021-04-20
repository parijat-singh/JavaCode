package programs.java.day1;

import second.pkg.TestA;
import second.pkg.TestB;

public class TestC {
	private static int Ca = 90;
	static int Cb = 100;
	protected static int Cc = 110;
	public static int Cd = 120;

	public static void main(String args[]) {
		//System.out.println("Aa = " + TestA.Aa);
		//System.out.println("Ab = " + TestA.Ab);
		//System.out.println("Ac = " + TestA.Ac);
		System.out.println("Ad = " + TestA.Ad);
		
		//System.out.println("Ba = " + TestB.Ba);
		//System.out.println("Bb = " + TestB.Bb);
		//System.out.println("Bc = " + TestB.Bc);
		System.out.println("Bd = " + TestB.Bd);
		
		System.out.println("Ca = " + TestC.Ca);
		System.out.println("Cb = " + TestC.Cb);
		System.out.println("Cc = " + TestC.Cc);
		System.out.println("Cd = " + TestC.Cd);
		
		//System.out.println("Da = " + TestD.Da);
		System.out.println("Db = " + TestD.Db);
		System.out.println("Dc = " + TestD.Dc);
		System.out.println("Dd = " + TestD.Dd);
	}
}
