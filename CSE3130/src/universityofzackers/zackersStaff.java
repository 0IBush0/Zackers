/*
Program: zackersstaff.java          Last Date of this Revision: March 30, 2022
Purpose: zackersStaff
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package universityofzackers;

public class zackersStaff extends universityofZackers

{
		//initializing string used to store the job title, which is staff specific 
		    private String jTitle;
			public zackersStaff(String Fn, String Ln, int Sal, String Job)
			{
				super();
				
				jTitle = Job;
				
			}
			//when the staff class is called it will return the job title 
			public String toString()
			{
				return(super.toString() + " " + jTitle);
				
			}
	
}

/* Screen Dump




 */