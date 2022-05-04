/*
Program: personalZackersAccount.java          Last Date of this Revision: April 5, 2022
Purpose: Personal Account
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package businessofzackers;


public class personalZackersAccount extends zackersAccount
{
	public personalZackersAccount(double bal, String fName, String lName, String str, String city, String st, String zip) 
	{		
	      super(bal, fName, lName, str, city, st, zip);
	      //declare variables
	      if (bal < 100)
	      {
	    	  bal = bal - 2;
	    	  System.out.println("Please deposit at Least $100 in your Personal Account,"
	    	  		+ "a $2.00 fee has been charged for this failed transaction.");//display message if not meeting requirements
	    	  toString();
	    	  
	      }
	}
}

/* Screen Dump




 */