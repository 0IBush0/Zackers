/*
Program: statspart2.java          Last Date of this Revision: May 6, 2022
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
		File dataFile;
		FileWriter out;
		FileReader in;
		BufferedWriter writeFile;
		BufferedReader readFile;
		
		Scanner input = new Scanner(System.in);
		NumberFormat num = NumberFormat.getPercentInstance();
		String StuName;
		String Score;
		String fileName;
		
		double scorValue = 0;
		double lowScore = 100;
		double higScore = 0;
		double AvgScore = 0;
		double totalScore = 0;
		int numScores = 0;
		int StuNum;
		//create variables
		
		System.out.print("Please enter the name Of The File: ");//grades.txt
		fileName = input.next();
		System.out.print("Please enter the number Of Students: ");
		StuNum = input.nextInt();

		try
		{
			dataFile = new File(fileName);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);

			for (int i = 0; i < StuNum; i++)
			{
				System.out.print("Please enter Student Name: ");
				StuName = input.next();

				System.out.print("(The Score is out of 1, please use decimals!)");//1 will be 100%, 0.1 will be 10%
				System.out.print("Please enter the test score: ");
				Score = input.next();

				writeFile.write(StuName);
				writeFile.newLine();

				writeFile.write(String.valueOf(Score));
				writeFile.newLine();
				
			}
			
			writeFile.close();
			out.close();
			System.out.println("Data has written to file.");

		}
			catch (IOException e)
			{
			System.out.println("A problem has occured while writing the file.");
			System.err.println("IOException: " + e.getMessage());
			//display error message
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
			    	scorValue = Double.parseDouble(Score);
			    	totalScore += scorValue;
				
			    	numScores += 1;
			    	totalScore += scorValue;
			    
			    if(scorValue < lowScore)
				{
				     lowScore = scorValue;
				     //store value
				}
			    if(scorValue > higScore)
				{
				     higScore = scorValue;
				     //store value
				}   
			  	}

			    AvgScore = totalScore / numScores;

			    System.out.println("The lowest score is: " + num.format(lowScore));
			    System.out.println("The highest score is: " + num.format(higScore));
			    System.out.println("The average score is: " + num.format(AvgScore));
			    //display scores
		}
		catch (IOException e)
		{
			System.out.println("A problem has occured while writing the file.");
			System.err.println("IOException: " + e.getMessage());
			//display error message
		}

	}

}

/* Screen Dump

Please enter the name Of The File: grades.txt
Please enter the number Of Students: 3
Please enter Student Name: John
(The Score is out of 1, please use decimals!)Please enter the test score: .2
Please enter Student Name: Joe
(The Score is out of 1, please use decimals!)Please enter the test score: .8
Please enter Student Name: Justin
(The Score is out of 1, please use decimals!)Please enter the test score: .6
Data has written to file.
John .2
Joe .8
Justin .6
The lowest score is: 20%
The highest score is: 80%
The average score is: 53%


 */
