/*
Program: universityofzackers.java          Last Date of this Revision: March 30, 2022
Purpose: universityofZackers
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/


package universityofzackers;

import java.util.Scanner;

public class universityofZackers

{

public static universityofZackers assign() 
		{
		Scanner input = new Scanner(System.in);
	
		//asking the set of questions for the variables
		System.out.println("Welcome to University of Zackers Employee Page!:");
		//ask 5 times for employees
		System.out.println("Please enter Employees First Name:");
		String Fn = input.next();
		
		System.out.println("Please enter Employees Last Name::");
		String Ln = input.next();
		
		System.out.println("Please enter Employees Salary:");
		int Sal = input.nextInt();
		
		System.out.println("Please enter Employee Type: Faculty or Staff:");
		//creates a string to store answer
		
		String EmpType;
		EmpType = input.next();
		
		if(EmpType.equalsIgnoreCase("Faculty"))
		{
			System.out.println("Enter Here, Department Name:");//print out enter department name
			String D = input.next(); 
			       D+= input.nextLine(); 
			//return specific to faculty that displays all of the input variables
		    return new zackersFaculty(Fn, Ln, Sal, D);
			
		}
		else	
		{
			System.out.println("Enter Here, Job Title/Position:");
			//May use multiple word answers
			String Job = input.next();
			       Job+= input.nextLine();
			
			//return specific to staff that displays all of the variables that have been inputed
			return new zackersStaff(Fn, Ln, Sal, Job);
			
		}
	
		}	
		//adding main class and employees 
		public static void main(String[] args)
		{
			//creates variable for each employees that are inputed, then display it
			universityofZackers emp1;
			universityofZackers emp2;
			universityofZackers emp3;
			universityofZackers emp4;
			universityofZackers emp5;
			//max 5 employees
			emp1 = assign();
			emp2 = assign();
			emp3 = assign();
			emp4 = assign();
			emp5 = assign();
			
			//after all three employees have had variables assigned to them, display all variables
			System.out.println("\nThree University Employees:");
			System.out.println(emp1);//print out emp1
			System.out.println(emp2);//print out emp2
			System.out.println(emp3);//print out emp3
			System.out.println(emp4);//print out emp4
			System.out.println(emp5);//print out emp5
		
		}	
	
}

/* Screen Dump
Welcome to University of Zackers Employee Page!:
Please enter Employees First Name:
Zac
Please enter Employees Last Name::
Qiu
Please enter Employees Salary:
10
Please enter Employee Type: Faculty or Staff:
Faculty
Enter Here, Department Name:
ZackersChoco
Welcome to University of Zackers Employee Page!:
Please enter Employees First Name:
Joe
Please enter Employees Last Name::
Jo
Please enter Employees Salary:
20
Please enter Employee Type: Faculty or Staff:
Staff
Enter Here, Job Title/Position:
Teacher
Welcome to University of Zackers Employee Page!:
Please enter Employees First Name:
Justin
Please enter Employees Last Name::
Sans
Please enter Employees Salary:
79
Please enter Employee Type: Faculty or Staff:
Faculty
Enter Here, Department Name:
ZackersPotatoes
Welcome to University of Zackers Employee Page!:
Please enter Employees First Name:
Jane
Please enter Employees Last Name::
Jon
Please enter Employees Salary:
467
Please enter Employee Type: Faculty or Staff:
Staff
Enter Here, Job Title/Position:
Janitor
Welcome to University of Zackers Employee Page!:
Please enter Employees First Name:
Bob
Please enter Employees Last Name::
Builder
Please enter Employees Salary:
2
Please enter Employee Type: Faculty or Staff:
Staff
Enter Here, Job Title/Position:
Chairman

Three University Employees:
universityofzackers.zackersFaculty@38082d64 ZackersChoco
universityofzackers.zackersStaff@dfd3711 Teacher
universityofzackers.zackersFaculty@42d3bd8b ZackersPotatoes
universityofzackers.zackersStaff@26ba2a48 Janitor
universityofzackers.zackersStaff@5f2050f6 Chairman
 */