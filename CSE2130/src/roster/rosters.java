/*
Program: rosters.java          Last Date of this Revision: May 3, 2022
Purpose: Roster
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package roster;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class roster extends StuName
{

		public roster(String fn, String ln) 
		{
			super(fn, ln);
			// TODO Auto-generated constructor stub
		}

		public static void main(String[] args)
		{
			
			File dataFile; 
			String fileName;
			String firstName, lastName;
			BufferedWriter writeFile;
			int StuNum;
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the name Of The File: ");
			fileName = input.nextLine();
			System.out.print("Enter The Number Of Students: ");
			StuNum = input.nextInt();
			
			try
			{
				
				FileOutputStream out = new FileOutputStream(fileName);
				ObjectOutputStream writeStu = new ObjectOutputStream(out);
				
				for (int i = 0; i < StuNum; i++)
				{
					
					System.out.print("Enter the Student's First Name: ");
					firstName = input.next();
					System.out.print("Enter the Student's Last Name: ");
					lastName = input.next();
					writeStu.writeObject(new StuName(firstName, lastName));
					
				}
				writeStu.close();
				//out.close();
				System.out.println("Data Written To File.");
				
				FileInputStream in = new FileInputStream(fileName);
				ObjectInputStream readStuName = new ObjectInputStream(in);
				
				for(int i = 0; i < StuNum; i++)
				{
				System.out.println((StuName)readStuName.readObject());
				}                  
				readStuName.close();
				
			}catch (FileNotFoundException e)
			{
				System.out.println("File Could Not Be found.");
				System.err.println("FileNotFoundException: " + e.getMessage());
			}
			catch(IOException e)
			{
				System.out.println("Problem with input/output");
				System.err.println("IOException: " + e.getMessage());
			}
			catch(ClassNotFoundException e)
			{
				System.out.println("Class could not be used to cast object.");
				System.err.println("ClassNotFoundException: " + e.getMessage());
			}
		}
		
}

/* Screen Dump




 */