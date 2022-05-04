/*
Program: reviewpuck.java          Last Date of this Revision: March 17, 2022
Purpose: review puck
Author: Zac Qiu
School: CHHS
Course: Computer Programming 30
 
*/

package pucks;


public class reviewpuck extends puck

{
		double AdMax = 5.5;
		double AdMin = 5;
		double YthMax = 4.5;
		double YthMin = 4;
		double weight;
		boolean standard, youth;

		public reviewpuck(double w)
		{
			weight = w;

			if(weight >= AdMin && weight <= AdMax)
			{
				standard = true;
				youth = false;
				
			}
			else if(weight >= YthMin && weight <= YthMax)
			{
				standard = false;
				youth = true;
				
			}
		}
		public String getDivision()
		{
		  String div;
		  
		  if(standard)
		  {
			  div = "puck is standard";
			  
		  }
		  else
		  {
			  div = "puck is youth";
			  
		  }
		  		return div;
		  	
		  }
		
		 public double getWeight()
		 {
			 return(weight);
		  
		 }
	    public boolean equals(Object p)
	    {
	    	reviewpuck testObj = (reviewpuck)p;

	    	if(testObj.getWeight() == weight)
	    	{
	    		return(true);
			  
	    	}
	    	else
	    	{
				return false;
				  
	    	}
	    }	
}  

/* Screen Dump




 */