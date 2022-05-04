/*
Program: statspart1.java          Last Date of this Revision: April 26, 2022
Purpose: Stats P1
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package stats;

import java.io.*;

public class statspart1
{
	public static void main(String[] args)
	{
		File DFile = new File("C:\\Users\\44220001\\git\\CS30\\CSE2130\\src\\myfiles");
		//get File location
		FileReader in;
		BufferedReader readFile;
		String StudentName;
		
		double HigScore = 0;//High Score Variable
		double LowScore = 100;//Low Score Variable
		double ScorValue = 0;//Score Value Variable
		double AveScore;//Average Score Variable
		double TotScore = 0;//Total Score Variable
		String numScores;
		int Score = 0;

		try
		{
			in = new FileReader(DFile);
			readFile = new BufferedReader(in);

			while((StudentName = readFile.readLine()) != null)
			{
				numScores = readFile.readLine();
				System.out.println(StudentName + " " + Score);
				numScores += 1;
				
			if(ScorValue < LowScore)
			{
				LowScore = ScorValue;

			}
			else if(ScorValue > HigScore)
			{
				HigScore = ScorValue;

			} 
			}
			readFile.close();
			in.close();

		} 
		catch(FileNotFoundException e)
		{
			System.out.println("File doesn't exist.");
			System.err.println("FileNotFoundException: "+ e.getMessage());
			//display  not found message
		}
		catch(IOException e)
		{
			System.out.println("File doesn't exist.");
			System.err.println("IOException: "+ e.getMessage());
			//display exception message 
		}
		 
	}
	 
}

/* Screen Dump




 */