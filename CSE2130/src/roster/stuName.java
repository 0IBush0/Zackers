/*
Program: stuName.java          Last Date of this Revision: April 14, 2022
Purpose: Student Names
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package roster;

import java.io.Serializable;

public class stuName implements Serializable 
{

	private String firstName;
	private String lastName;
	
	public stuName(String fn, String ln)
	{
		firstName = fn;
		lastName = ln;
		
	}
	
	public String toString()
	{
		return(firstName + " " + lastName);
		 
	}
	
}

/* Screen Dump




 */