/*
Program: zackersCustomer.java          Last Date of this Revision: April 5, 2022
Purpose: Customer
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package businessofzackers;

public class zackersCustomer
{
	private String firstName, lastName, street, city, state, zip;

	public zackersCustomer(String fName, String lName, String stre, String c, String s, String z)
	{
		//declare variables
		firstName = fName;
		lastName = lName;
		
		street = stre;
		city = c;
		state = s;
		zip = z;
		
	}
	
	public String toString()
	{
		String custString;
		
		custString = firstName + " " + lastName + "\n";
		custString += street + "\n";
		custString += city + ", " + state + "  " + zip + "\n";

	 	return(custString);

	}

}

/* Screen Dump




 */