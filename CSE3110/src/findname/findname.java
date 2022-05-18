/*
Program: findname.java          Last Date of this Revision: May 18, 2022
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package findname;


import java.util.Scanner;

public class findname
{
	public static void main(String[] args)
	{
	   Scanner input = new Scanner(System.in);
	   String name = null;
	   int location;
	   String[] nameCount = new String[3];//the array go from 0 to 2, for example: 0,1,2
	   //prompt for 3 names
       for(int i = 0; i < nameCount.length;i ++)
       {
    	   System.out.println("Please enter a name: ");
    	   nameCount[i] = input.next();
    	   //store name
       }

   	   System.out.println("Enter the name you would like to search for: ");
   	   //ask for the name the user has input
   	   name = input.next();
       location = search.linear(nameCount, name);
 
       if (location == -1)
       {
    	   System.out.println("This name does not exist within the array, please try again.");
    	   //display error message
       }
       else
       {
    	   System.out.println("The location of this name is: " + location);
    	   //display location
       }
 
	}
	
}

/* Screen Dump

Please enter a name: 
Joe
Please enter a name: 
Ryan
Please enter a name: 
Zac
Enter the name you would like to search for: 
Ryan
The location of this name is: 1


 */
