/*
Program: myfilepart2.java          Last Date of this Revision: May 9, 2022
Purpose: My File P2
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package myfiles;

import java.io.*;
import java.util.Scanner; 

public class myfilepart2
{
	    File textFile = new File("Bread.txt");//file name Bread.txt
		{
			Scanner input = new Scanner(System.in);
			try
			{
				textFile.createNewFile();
				System.out.println("New file created.");
				//prompt new file message
			}
			catch(IOException e)
			{
				System.out.println("File cannot be created.");
				System.err.println("IOException: " + e.getMessage());
				//check for exceptions, if error, do not create file
			}

			System.out.println("Save or Delete?");
			String action = input.next();
			String Save;
			String Delete;
		
			if(action.equalsIgnoreCase("Save"))
			{
				textFile.exists();
				System.out.println("File saved.");
				//display save message
			}
			else if(action.equalsIgnoreCase("Delete"))
			{
				textFile.delete();
				System.out.println("File deleted.");
				//display delete message
			}
			
	    }
	    
}

/* Screen Dump




 */
