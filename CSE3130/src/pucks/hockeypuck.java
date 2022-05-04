/*
Program: hockeypuck.java          Last Date of this Revision: March 17, 2022
Purpose: Hockey Puck
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package pucks;

import java.text.NumberFormat;
import java.util.Scanner;

	public class hockeypuck
	{
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			
			reviewpuck pA = new reviewpuck(5.5);
			reviewpuck yt = new reviewpuck(4.0);

			System.out.println(pA.getWeight());//print out pAWeight
			System.out.println(pA.getDivision());//print out pADivision
			System.out.println(pA.getRadius());//print out pARadius

			System.out.println(yt.getWeight());//print out ytWeight
			System.out.println(yt.getDivision());//print out ytDivision
			System.out.println(yt.getRadius());//print out ytRadius

			String action;
			int w;
			double wArg;
			
			if(pA.equals(yt))//check for equal
			{
				System.out.println("true");
				
			}
			else
			{
				System.out.println("false");
				
			}
		}
}

/* Screen Dump




 */