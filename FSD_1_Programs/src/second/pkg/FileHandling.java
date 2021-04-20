package second.pkg;

import java.util.*;
import java.io.*;

public class FileHandling {
	 public static void main(String[] args) {
		 
		 FileHandler fh = new FileHandler();
		 
		 System.out.println("**********************************************************");
		 System.out.println("*                Welcome to LockedMe.com                 *");
		 System.out.println("*                                                        *");
		 System.out.println("*                Developer: Parijat Singh                *");
		 System.out.println("**********************************************************");
		 System.out.println();
		 //char ch;
		 Scanner scan = new Scanner(System.in);
		 do {
			 boolean x = fh.mainmenu();
			 if (x) {
				 System.out.println("\nDo you want to continue (Type y or n) \n");
		         fh.ch = scan.next().charAt(0);
		         if (fh.ch == 'y') {
		        	 continue;
		        	 
		         } else if (fh.ch == 'n') {
		        	 fh.systemquit();
		         } else {
		        	 System.out.println("You did not enter y or n, Exiting System.");
		        	 fh.systemquit();
		         }
	         } else fh.ch = 'n';
	 
	     } while (fh.ch == 'Y'|| fh.ch == 'y'); 
	 
	 }


}
