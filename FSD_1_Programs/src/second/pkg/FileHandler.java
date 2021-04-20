package second.pkg;

import java.util.*;
import java.io.*;


public class FileHandler {
	
	public char ch;
	
	public FileHandler() {
		ch = 'y';
	}
	public void systemquit() {
		System.out.println("Thank you for using LockedMe.com File Handling system.");
		System.out.println("Good Bye!");
		ch = 'n';
	}
	public boolean mainmenu() {
		boolean quitvar = true;
		System.out.println("Pick from the following Menu items:");
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
	            	System.out.println("List of files in Alphabetical order:");
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
                //System.out.println("inChoice 2 ");
            	boolean y = ASRMenu();
                
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
	
	public boolean ASRMenu() {
		boolean quitvarASR = true;
		System.out.println("Which File operation would u like to perform:");
		System.out.println("1. Add File");
		System.out.println("2. Remove File");
		System.out.println("3. Search for a File");	 
		System.out.println("4. Return to Main Menu");
		Scanner scanASR = new Scanner(System.in); 
		int choiceASR = scanASR.nextInt();
		switch (choiceASR)
        {
        case 1 : 
        	Scanner scanPath = new Scanner(System.in); 
        	System.out.println("Enter File Path where u want to add File:");
        	String filePath = scanPath.nextLine();
        	Scanner scanFileAdd = new Scanner(System.in); 
        	System.out.println("Enter File Name:");
        	String addFileName = scanFileAdd.nextLine();
        	try {  
	            File addFile = new File(filePath + "\\" + addFileName);
	            
	            if (addFile.createNewFile()) {  
	                System.out.println("New File is created!");  
	            } else {                   
	                if(addFile.exists()) {
	                    System.out.println("File already exists.");
	                }
	            }
	        } catch (IOException e) {  
	            e.printStackTrace(); 
	        }
            break;                         
        case 2 : 
            Scanner scanPathR = new Scanner(System.in); 
            System.out.println("Enter File Path from where u want to remove File:");
        	String filePathR = scanPathR.nextLine();
        	Scanner scanFileRem = new Scanner(System.in); 
        	System.out.println("Enter File Name:");
        	String remFileName = scanFileRem.nextLine();
        	try {  
	            File remFile = new File(filePathR + "\\" + remFileName);
	            
	            if (remFile.delete()) {  
	                System.out.println("File Deleted!");  
	            } else {                   
	                if(!remFile.exists()) {
	                    System.out.println("File not found");
	                }
	            }
            }
            catch(Exception e)
            {
                System.out.println("Error : " +e.getMessage());
            }
            break;                         
        case 3 : 
        	Scanner scanPathS = new Scanner(System.in); 
            System.out.println("Enter File Path where u want Search File:");
        	String filePathS = scanPathS.nextLine();
        	Scanner scanFileSer = new Scanner(System.in); 
        	System.out.println("Enter File Name:");
        	String SerFileName = scanFileSer.nextLine();
        	try {  
	            File SerFile = new File(filePathS + "\\" + SerFileName);
	            
	            if (SerFile.exists()) {  
	                System.out.println("File Exists!"); 
	                System.out.println("Full Path of the file is " + filePathS + "\\" + SerFileName);
	            } else {                   
	                System.out.println("File not found");
	              }
            }
            catch(Exception e)
            {
                System.out.println("Error : " +e.getMessage());
            }
            break;
        case 4 : 
        	break;
        	default : System.out.println("Wrong Entry \n ");
        	break;
        }
		return quitvarASR;
	}


}
