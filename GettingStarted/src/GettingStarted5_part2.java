

import com.phidget22.HumiditySensor;
import com.phidget22.TemperatureSensor;

public class GettingStarted5_part2
{

	public class GettingStarted 
	{
	    public void main(String[] args) throws Exception
	    {

	        //Create 
	        HumiditySensor humiditySensor = new HumiditySensor();
	        TemperatureSensor temperatureSensor = new TemperatureSensor();
	        
	        //Address 
	        humiditySensor.setHubPort(3);
	        humiditySensor.setIsHubPortDevice(true);

	        //Open 
	        humiditySensor.open(1000);
	        temperatureSensor.open(1000);
	        
	        while(true)
	        {
	        	if(humiditySensor.getHumidity() >= 30)
	        	{
	            System.out.println("Humidity: " + humiditySensor.getHumidity() +" %RH");
	            Thread.sleep(150);
	            
	        	}
	        	else
	        	{
	        		System.out.println("Humidity is too Low");
	        		
	        	}
	        	System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C");

	        	if(temperatureSensor.getTemperature() >= 21)
	        	{
	            System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
	            Thread.sleep(150);
	            
	        	}
	        	else
	        	{
	        		System.out.println("Temperature is too Low");
	        		
	        	}
	        	System.out.println("Humidity: " + humiditySensor.getHumidity() +" %RH" );
	        	
	        }
	        
	    }
	}
	
}