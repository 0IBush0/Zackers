/*
Program: diskpuck.java          Last Date of this Revision: March 17, 2022
Purpose: Disk Puck
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package pucks;

public class diskpuck extends puck
{
	private double Thickness;
	
	   public diskpuck(double r, double t)
	   {
	   		super(r);
	   		Thickness = t;
	   	
	   }
	   public void setThickness (double newThickness)
	   {
	   		Thickness = newThickness;
	   	
	   }
	   public double getThickness()
	   {
	   		return(Thickness);
	   }
	  
	   public double volume()
	   {
		   double v;
	   	
		   v = super.area();
		   return(v);
	   	
	   }
	  
	   public boolean equals(Object d)
	   {
		   diskpuck testObj = (diskpuck)d;
	   	
	   		if(testObj.getRadius() == super.getRadius() && testObj.getThickness() == Thickness)//check for thickness
	   		{
	   			return(true);
	   			
	   		}
	   	
	   		else
	   		{
	   			return(false);
	   			
	   		}
	   		
	   }
	   public String toString()
	   {
	   String diskString;
	   diskString = "The Disk Has A Radius Of: " + super.getRadius() + " And Thickness Of " + Thickness + ".";//display text
	   return(diskString);
	   	
	   }
	   
}

/* Screen Dump




 */