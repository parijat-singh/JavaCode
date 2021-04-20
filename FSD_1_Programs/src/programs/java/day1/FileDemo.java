package programs.java.day1;

import java.io.*;

public class FileDemo {
	public static void main(String args[]) {
		try {
			File myFile = new File ("C://Users//parij//OneDrive//Documents//Caltech PGP//IO//login.txt");
			if (myFile.createNewFile()) {
				System.out.println("myFile - New file created");
			} else {
				if (myFile.exists()) {
					System.out.println("File already exists");
					System.out.println("File Path: " + myFile.getAbsolutePath());
					System.out.println("File Name: " + myFile.getName());
					System.out.println("File Class: " + myFile.getClass());
				}
				boolean b = myFile.delete();
				if (b==true) {
					System.out.println("File Deleted");
				} else {
					System.out.println("File Not Deleted");
				}
			}
		}
		catch (IOException e){
			e.printStackTrace();
			
		}
		
	}

}
