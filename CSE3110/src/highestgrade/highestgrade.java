/*
Program: highestgrade.java        Last Date of this Revision: May 18, 2022
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package highestgrade;


import java.util.Scanner;

public class highestgrade
{
	public static void main(String[] args)
	{
		double scorValue = 0;
		double lowScore = 100;
		double higScore = 0;
		int num = 0;
		int[] grade = new int[3];
		//ask 3 times
		Scanner input = new Scanner(System.in);

	    for(int i = 0; i < grade.length;i ++)
	    {
			 System.out.println("Please enter a grade between 0-100: ");
			 //prompt for a number between 0-100
			 num = input.nextInt();
			 grade[i] = num;

	    }
	    for(int i = 0; i < grade.length;i ++)
	    {
			 if(num > higScore)//check value
		     {
			     higScore = num;

		     }
			 
	    }
	    	System.out.println("The highest score: " + higScore);
	    	//display the highest grade
	}

}

/* Screen Dump

Please enter a grade between 0-100: 
20
Please enter a grade between 0-100: 
30
Please enter a grade between 0-100: 
40


 */
