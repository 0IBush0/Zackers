/*
Program: zackersemployee.java          Last Date of this Revision: March 30, 2022
Purpose: zackersEmployee
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package universityofzackers;

public class zackersEmployee

{
	private String firstName, lastName;//declare first name and last name
	private Integer Salary; 
	
	public zackersEmployee(String Fn, String Ln, Integer Sal)
	{
		firstName = Fn;
		lastName = Ln;
		Salary = Sal;
		
	}
	
	public String toString()
	{
		return (firstName + " " + lastName + " $" + Salary);
	 
    }
	
}

/* Screen Dump




 */