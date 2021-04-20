package second.pkg;

import java.util.*;
import java.io.*;


public class FileHandlingSingleClass {
	
	public static void systemquit() {
		System.out.println("Thank you for using LockedMe.com File Handling system.");
		System.out.println("Good Bye!");
	}
	public static boolean mainmenu() {
		boolean quitvar = true;
		System.out.println("Pick form the following Menu items:");
		System.out.println("1. List files");
		System.out.println("2. Add/Remove/Search");
		System.out.println("3. Exit Application");	 
		Scanner scan = new Scanner(System.in); 
		int choice = scan.nextInt();
		switch (choice)
        {
        case 1 : 
        	Scanner scan1 = new Scanner(System.in); 
        	System.out.println("Enter File Path:");
        	String filePath = scan1.nextLine();
        	String[] pathnames;
        	try {  
	            File file = new File(filePath);
	            
	            if (file.exists()) {
	            	pathnames = file.list();
	            	for (String pathname : pathnames) {
	            		System.out.println(pathname);		
	            	}
	            	                       
	            } else System.out.println("File path does not exist!") ;  
	        } catch (Exception e) {  
	            e.printStackTrace(); 
	        }
            break;                         
        case 2 : 
            try
            {
                System.out.println("inChoice 2 ");
            }
            catch(Exception e)
            {
                System.out.println("Error : " +e.getMessage());
            }
            break;                         
        case 3 : 
            try
            {
                systemquit();
                quitvar = false;
            }
            catch(Exception e)
            {
                System.out.println("Error : "+e.getMessage());
            }
            break;
        	default : System.out.println("Wrong Entry \n ");
        	break;
        }
		return quitvar;
	}
	 public static void main(String[] args) {
		 
		 System.out.println("**********************************************************");
		 System.out.println("*                Welcome to LockedMe.com                 *");
		 System.out.println("*                                                        *");
		 System.out.println("*                Developer: Parijat Singh                *");
		 System.out.println("**********************************************************");
		 System.out.println();
		 char ch = 'y';
		 Scanner scan = new Scanner(System.in);
		 do {
			 boolean x = mainmenu();
			 if (x) {
				 System.out.println("\nDo you want to continue (Type y or n) \n");
		         ch = scan.next().charAt(0);
		         if (ch == 'y') {
		        	 continue;
		        	 
		         } else if (ch == 'n') {
		        	 systemquit();
		         } else {
		        	 System.out.println("You did not enter y or n, Exiting System.");
		        	 systemquit();
		         }
			 } else ch = 'n';
	 
	     } while (ch == 'Y'|| ch == 'y'); 
	 
	 }
}
