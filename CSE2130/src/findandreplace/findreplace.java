/*
Program: findreplace.java          Last Date of this Revision: May 4, 2022
Purpose: Find and Replace
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package findandreplace;


import java.io.*;
import java.util.Scanner;

public class findreplace
{
	public static void main(String[] args) 
	{
		String fName, findText,replacedText;
		//create variables
		Scanner input = new Scanner(System.in);
		BufferedReader readFile;
		FileReader in;
		String replaced = null;
		
		System.out.print("Please enter file name:");
		//test file name is Zackers.txt, type in Zackers.txt
		fName = input.nextLine();
		File tFile = new File(fName);
		//look for text file
		try
		{
			System.out.println("What would you like to replace? (Letters only)");
			//prompt for the letter or word the user would like to replace
			findText = input.nextLine();
			System.out.println("What would you like to replace it with?");
			//prompt for the letter or word to replace that letter or word with.
			replacedText = input.nextLine();
			//replace text
			in = new FileReader(tFile);
			readFile = new BufferedReader(in);
			
			replacedText = readFile.readLine();
			System.out.println(replaced);
			System.out.println("Replacing " + findText + " with " + replacedText);
			System.out.println(replaced.replaceAll(findText, replacedText));
			
			readFile.close();
			in.close();
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File doesn't exist.");
			System.err.println("FileNotFoundException: "+ e.getMessage());
			
		}
		catch(IOException e)
		{
			System.out.println("A problem has occured in reading the file.");
			System.err.println("IOException: "+ e.getMessage());
			
		}
		
	}

}	


/* Screen Dump




 */