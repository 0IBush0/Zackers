/*
Program: myfilepart1.java          Last Date of this Revision: April 26, 2022
Purpose: My File P1
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package myfiles;

import java.io.*;
import java.util.Scanner;

public class myfilepart1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of your file: ");
		String files = input.next();
		//prompt for user text
		File textfile = new File("c:\\temp\\supplies.txt");
		if (textfile.exists())
		{
			System.out.println("File already exists.");
			//display exist message
		}
		else
		{
			System.out.println("File does not exist.");
			//display none existent message
		}
		
	}
	
}

/* Screen Dump




 */