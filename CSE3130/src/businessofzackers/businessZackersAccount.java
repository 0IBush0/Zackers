/*
Program: businessZackersAccount.java          Last Date of this Revision: April 5, 2022
Purpose: Business Account
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package businessofzackers;


public class businessZackersAccount extends zackersAccount
{
	public businessZackersAccount(double bal, String fName, String lName, String str, String city, String st, String zip) 
	{
	      super(bal, fName, lName, str, city, st, zip);
	
	      if (bal < 500) 
	      {
	    	  bal = bal - 10;
	    	  System.out.println("Please deposit at Least $100 in your Business Account,"
	    	  		+ "a $10.00 fee has been charged for this failed transaction.");//display message if not meeting requirements
	    	  toString();
	    	  
	      }
	}
}

/* Screen Dump




 */