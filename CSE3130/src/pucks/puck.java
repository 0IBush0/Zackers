/*
Program: puck.java          Last Date of this Revision: March 17, 2022
Purpose: Puck
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package pucks;

public class puck

	{
		   private static double PI = 3.141592;
		   private double radius;
		   
		   public puck()
		   {
		       radius = 1;//set radius to 1

		   }


		   public puck(double r)

		   {
		       radius = r;//set radius to r
		       
		   }
		   public void setRadius(double newRadius)
		   {
		       radius = newRadius;//new radius   
		       
		   }
		   public double area()
		   {
		       double circleArea;
		       circleArea = PI * radius * radius;//formula for circleArea

		       return(circleArea);
		       
		   }
		   public double getRadius()
		   {
		       return(radius);
		       
		   }
		   public double circumference()
		   {
		       double circleCircumference;
		       circleCircumference = 2 * PI * radius;//formula for circleCircumference
		       return(circleCircumference);
		       
		   }
		   public static void displayAreaFormula()
		   {
		   	
		       System.out.println("Area For A Circle Is: A= (PI)(r)^2");
		       
		   }
		   public boolean equals(Object c)
		    {
			   puck testObj = (puck)c;
		       if (testObj.getRadius() == radius)//check radius
		       {
		           return(true);
		           
		       }
		       else
		       { 
		           return (false);
		           
		       }
		    }
		    public String toString()
		    {
		        String circleString;
		        circleString = "The Circle has a Radius of " + radius;//set text
		        
		        return(circleString);
		        
		    }
	}

/* Screen Dump




 */