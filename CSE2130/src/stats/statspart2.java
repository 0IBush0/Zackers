/*
Program: statspart2.java          Last Date of this Revision: May 2, 2022
Purpose: Stats P2
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package stats;

import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class statspart2
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
			
		File dataFile; 
		FileWriter out;
		FileReader in;
		BufferedWriter writeFile;
		BufferedReader readFile;
			
		String StuName;
		String Score;
		String fileName;
		double ScorValue = 0;
		double LowScore = 100;
		double HigScore = 0;
		double AveScore = 0;
		double TotScore = 0;
		int numScores = 0;
		int studentNum;
		//declare variables
			
		System.out.print("Please enter file name: ");
		fileName = input.next();
		//prompt for file name
		System.out.print("Please enter the number Of Students: ");
		studentNum = input.nextInt();
		//store number of students
		try
		{
			dataFile = new File(fileName);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
				
			for (int i = 0; i < studentNum; i++)
			{	
				System.out.print("Please enter Student Name: ");
				StuName = input.next();
				System.out.print("Please enter their test Score: ");
				Score = input.next();
				//store user inputs
				writeFile.write(StuName);
				writeFile.newLine();
				
			}
			writeFile.close();
			System.out.println("File has been changed to the written value");
			//rewritten message
		}
		catch (IOException e)
		{
			System.out.println("A problem has occured with writing the file.");
			System.err.println("IOException: " + e.getMessage());
			//check for exceptions
		}
		try
		{
			dataFile = new File(fileName);
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
		while((StuName = readFile.readLine()) != null)
		{			    	
			Score = readFile.readLine();
			System.out.println(StuName + " " + Score);
			numScores += 1;
			ScorValue = Double.parseDouble(Score);
			TotScore += ScorValue;
					
			if(ScorValue < LowScore)
			{
				LowScore = ScorValue;
				//check for score value
			}
			else if(ScorValue > HigScore)
			{
				HigScore = ScorValue;
				//check for score value
			}
			
		}
			
			AveScore = TotScore / numScores;
			//formula for average score
			NumberFormat NF = NumberFormat.getPercentInstance();
			//select format
			System.out.println("The lowest score is: " + NF.format(LowScore));
			System.out.println("The highest score is: " + NF.format(HigScore));
			System.out.println("The average score is: " + NF.format(AveScore));
			//print out all scores
				
		}
		catch (IOException e)
		{
				System.out.println("A problem has occured with rewriting the file.");
				System.err.println("IOException: " + e.getMessage());
				//send error message
		}
			
		}
	}

/* Screen Dump




 */