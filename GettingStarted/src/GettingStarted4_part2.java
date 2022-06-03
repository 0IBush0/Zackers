import com.phidget22.TemperatureSensor;

public class GettingStarted4_part2
{

    public static void main(String[] args) throws Exception
    {
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        temperatureSensor.open(1000);
        
        double F;
        double C = 0;
        F = (temperatureSensor.getTemperature() * 1.8) + 32;
        //Fahrenheit conversion formula
        while (true) 
        {
			System.out.println("Temperature: " + F + " °F" );
            Thread.sleep(150);
            
        }
        
    }
	
}