/*
Program: zackersfaculty.java          Last Date of this Revision: March 30, 2022
Purpose: zackersFaculty
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package universityofzackers;

public class zackersFaculty extends universityofZackers

{
		private String Dname;
		
		public zackersFaculty(String Fn, String Ln, Integer Sal, String D)
		{
			super();
			Dname = D;
			
		}
		
		public String toString()
		{
			return(super.toString() + " " + Dname);
			
		}
		
	}

/* Screen Dump




 */