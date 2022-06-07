import com.phidget22.*;

public class twophidget {
    public static void main(String[] args) throws Exception{

        //Create 
        TemperatureSensor temperatureSensor0 = new TemperatureSensor();
        TemperatureSensor temperatureSensor1 = new TemperatureSensor();

         //Address | Smart Phidgets must be addressed when you are using more than one of the same software objects in your program. Setting the HubPort allows you to keep track of which physical Phidget is paired with each software object. If you do not address the objects, your program will have unpredictable results.
         temperatureSensor0.setHubPort(3);
         temperatureSensor1.setHubPort(2);

        //Open 
        temperatureSensor0.open(1000);
        temperatureSensor1.open(1000);

        //Use your Phidgets 
        while (true) {
            System.out.println("Temperature 0: " + temperatureSensor0.getTemperature() + " °C" );
            System.out.println("Temperature 1: " + temperatureSensor1.getTemperature() + " °C" );
            Thread.sleep(150);
        }
    }
}
 