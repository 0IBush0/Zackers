/*
Program: roster.java          Last Date of this Revision: May 5, 2022
Purpose: Roster
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30

*/
package roster;

import java.io.*;
import java.util.Scanner;

public class rosters
{
	public static void main(String[] args)
	{
		String fileName;
		Scanner input = new Scanner(System.in);
		FileReader in;
		BufferedReader readFile;
		BufferedWriter writeFile;
		String firstName, lastName;
		int stuNum;
		Double stuAmount;

		System.out.print("Enter the name of the test file:");
		fileName = input.nextLine();
		System.out.println("How Many Students?");
		stuNum = input.nextInt();
		File textFile = new File(fileName);

		try
		{
			FileOutputStream out = new FileOutputStream(textFile);
			ObjectOutputStream writeStu = new ObjectOutputStream(out);
			
			for(int i = 0; i < stuNum; i++)
			{
				System.out.println("Enter Student First Name");
				firstName = input.next();
				System.out.println("Enter Student Last Name");
				lastName = input.next();

				writeStu.writeObject(new stuName (firstName, lastName));
				
			}
			writeStu.close();

			System.out.println("Data has been written to file.");

			FileInputStream in1 = new FileInputStream(textFile);
			ObjectInputStream readStu = new ObjectInputStream(in1);


			for(int i = 0; i < stuNum; i++)
			{
				System.out.println((stuName)readStu.readObject());
				
			}
			readStu.close();
 
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File does not exist!");
			System.err.println("FileNotFoundException: "+ e.getMessage());
			
		}
		catch(IOException e)
		{
			System.out.println("Problem reading file.");
			System.err.println("IOException: "+ e.getMessage());
			
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			
		}

	}

}

/* Screen Dump




 */
