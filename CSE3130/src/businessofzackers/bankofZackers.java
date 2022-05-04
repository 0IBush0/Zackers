/*
Program: bankofZackers.java          Last Date of this Revision: April 5, 2022
Purpose: Zackers Bank
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package businessofzackers;

import java.util.Scanner;

public class bankofZackers
{
		public static zackersCustomer assign() 
		{
		try (Scanner input = new Scanner(System.in))
			{
				System.out.println("Welcome to the Bank Of Zackers, To manage your account, please complete the following:");//welcome message
				//ask for values from user
				System.out.println("Please enter your First Name: ");
				String Fn = input.next();
				
				System.out.println("Please enter Your Last Name: ");
				String Ln = input.next();
				
				System.out.println("Please enter the City you live in: ");
				String C = input.next();
				
				System.out.println("Please enter the State/Province you live in: ");
				String S = input.next();
				
				System.out.println("Please enter the Street Address you live in: ");
				String s = input.next();
				s+= input.nextLine();
			       
				System.out.println("Please enter your Postal Code:");
				String P = input.next();

				System.out.print("\nYour account details are as below:");
				return new zackersCustomer(Fn, Ln, C, S , s, P);
				//prompt finalized account details
			}
		
		}
		
		public static void main(String[] args) 	
		{
			zackersCustomer cust;		
			cust = assign();
			System.out.println(cust);
			
		}
		
}

/* Screen Dump

Welcome to the Bank Of Zackers, To manage your account, please complete the following:
Please enter your First Name: 
Zac
Please enter Your Last Name: 
Qiu
Please enter the City you live in: 
Calgary
Please enter the State/Province you live in: 
Alberta
Please enter the Street Address you live in: 
Cov Blue Zackers
Please enter your Postal Code:
A1A A1A

Your Finalized Account Details are Listed Below:Zac Qiu
Calgary
Alberta, Cov Blue Zackers  A1A

 */