/*
Program: myfilepart2.java          Last Date of this Revision: April 26, 2022
Purpose: My File P2
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package myfiles;

import java.awt.event.ActionEvent;
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
			//check for exceptions, if error, do not creare file
		}

		System.out.println("n\\ Save this File \\ Delete this File");
		String action = input.next();
		String SF;
		String DF;
		
		if(action.equalsIgnoreCase("SF"))
		{
			textFile.exists();
			System.out.println("File saved.");
			//display save message
		}
		else if(action.equalsIgnoreCase("DF"))
		{
			textFile.delete();
			System.out.println("File deleted.");
			//display delete message
		}
	    }
	    
}
/* Screen Dump




 */