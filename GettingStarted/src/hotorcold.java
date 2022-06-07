import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;
public class hotorcold
{
	public static void main(String[] args) throws Exception
	 {
	     TemperatureSensor temperatureSensor = new TemperatureSensor();
	     temperatureSensor.setHubPort(3);
	     DigitalOutput greenLED = new DigitalOutput();
	     greenLED.setHubPort(1);
	     greenLED.setIsHubPortDevice(true);
	     DigitalOutput redLED = new DigitalOutput();
	     redLED.setHubPort(2);
	     redLED.setIsHubPortDevice(true);
	     
	     temperatureSensor.open(1000);
	     redLED.open(1000);
	     greenLED.open(1000);
	     
	     while(true)
	     {
	    	 if (temperatureSensor.getTemperature() > 19)//if more than 19, turn green
	    	 {
	    		 greenLED.setState(true);
	    		 int T = (int) temperatureSensor.getTemperature();
	    		 System.out.println("Temperature: " + T + "°C");
	    		 Thread.sleep(1000);
	    		 
	    	 }
	    	 if (temperatureSensor.getTemperature() < 25)//if less than 25, turn green
	    	 {
	    		 greenLED.setState(true);
	    		 int T = (int) temperatureSensor.getTemperature();
	    		 System.out.println("Temperature: " + T + "°C");
	    		 Thread.sleep(1000);
	    		 
	    	 }
	    	 else
	    	 {
	    		 redLED.setState(true);//if more or less, turn red
	    		 int T = (int) temperatureSensor.getTemperature();
	    		 System.out.println("Temperature: " + T + "°C");
	    		 Thread.sleep(1000);
	    		 
	    	 }
	    	 
	     }

	 }
	
}
