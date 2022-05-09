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
		String fileName, searchText, replaceText;
		//create variables
		try (Scanner input = new Scanner(System.in))
		{
			BufferedReader readFile;
			FileReader in;
			String replaced;
		
			System.out.print("Please enter file name:");
			//test file name is Zackers.txt, type in Zackers.txt
			fileName = input.nextLine();
			File tFile = new File(fileName);
			//look for text file
			
		try
		{
			System.out.println("What would you like to replace? (only words from the list below)");
			System.out.println("bagel, red, orange, banana, potato, word, green, lime.");
			//prompt for the letter or word the user would like to replace
			//the file consists of "bagel red orange banana potato word green lime"
			searchText = input.nextLine();
			
			System.out.println("What would you like to replace it with?");
			//prompt for the letter or word to replace that letter or word with.
			replaceText = input.nextLine();
			//replace text
			
			in = new FileReader(tFile);
			readFile = new BufferedReader(in);
			
			replaced = readFile.readLine();
			System.out.println(replaced);
			
			System.out.println("Now replacing " + searchText + " with " + replaceText);
			System.out.println(replaced.replaceAll(searchText, replaceText));
			
			readFile.close();
			in.close();
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println("This file doesn't exist!");
			System.err.println("FileNotFoundException: "+ e.getMessage());
			
		}
		catch(IOException e)
		{
			System.out.println("A problem has occured in reading the file.");
			System.err.println("IOException: "+ e.getMessage());
			
		}
		}
		
	}
	

}	


/* Screen Dump

Please enter file name:Zackers.txt
What would you like to replace? (only words from the list below)
bagel, red, orange, banana, potato, word, green, lime.
bagel
What would you like to replace it with?
milk
bagel red orange banana potato word green lime
Now replacing bagel with milk
milk red orange banana potato word green lime


 */
