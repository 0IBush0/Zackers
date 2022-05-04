/*
Program: zackersAccount.java          Last Date of this Revision: April 5, 2022
Purpose: Account
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package businessofzackers;

import java.text.NumberFormat;

public class zackersAccount
{
	private double balance;
	private zackersCustomer cust;

	public zackersAccount(double bal, String fName, String lName, String stre, String city, String st, String zip)
	{
		balance = bal;
		cust = new zackersCustomer(fName, lName, stre, city, st, zip);
		//store variables
	}
	
	public double getBalance()
	{
	 	return(balance);//return balance

	}

	public void deposit(double amt)
	{
	 	balance += amt;//increase upon deposit

	}

	public void withdrawal(double amt)
	{
	 	if (amt <= balance)//check for balance
	 	{
	 		balance -= amt;//decrease upon withdrawn

	 	}
	 	else
	 	{
	 		System.out.println("Currently there's not enough money in your account, please try again later.");
	 		//display when the money is not enough
	 	}

	}

	public String toString()
	{
		String accountString;
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		accountString = cust.toString();
		accountString += "Your current balance is " + money.format(balance);
		//display balance value
	 	return(accountString);
	 	
	}

}

/* Screen Dump




 */