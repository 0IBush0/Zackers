/*
Program: myfilepart1.java          Last Date of this Revision: May 9, 2022
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
		System.out.print("Please Enter the name of a file: ");
		//prompt for file name, file name is "Bread.txt"
		String fileName = input.next();
		File textFile = new File(fileName);
		
		if(textFile.exists())
		{
			System.out.println("File already exists.");
			//file existing message
		}
		else
		{
			System.out.println("File does not exist.");
			//file does not exist message
		}
		
	 }

}

/* Screen Dump

Please Enter the name of a file: Bread.txt
File already exists.


 */
