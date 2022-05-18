/*
Program: squares.java          Last Date of this Revision: May 18, 2022
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package squares;

import java.util.Scanner;


public class squares
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] SquareR = new int[5];
		//5 elements will be displayed
	    for(int i = 0; i < SquareR.length;i ++)
	    {
	    	SquareR[i] = i * i;
	    	
	    }
	    for(int i = 0; i < SquareR.length;i ++)
	    {
	    	System.out.println(SquareR[i]);

	    }

 	}
}


/* Screen Dump

0
1
4
9
16


 */
