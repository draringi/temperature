/** 
 * @author Aditya Mahajan <aditya.mahajan@mcgill.ca>
 * @contributor Michael Williams (260369438)
 * @version 2013.10.06
 * Unit Testing Temperature class
 */

import org.junit.* ;
import static org.junit.Assert.* ;

public class TemperatureTest {

  // Add multiple tests to check all functions of
  // {@Code Temperature} class.

  
   // Check that we are able to retreave the entered value correctly
   @Test
   public void test_getTemperature (){
      System.out.println("Test Temperature's getValue funtion");
      Temperature T = new Temperature(0,Temperature.Units.CELSIUS);
      System.out.println(T.toString());
      assertTrue(Math.abs(T.getValue()) < 1e-6);
      assertTrue(T.getUnits() == Temperature.Units.CELSIUS);
   }

   // Check Conversion to Kelvin from Celsius, 0 C (freezing temperature of water)
   // is chosen due to it being mentioned as an example in the code
   @Test
   public void test_celsiusToKelvin (){
      System.out.println("Test Temperature's conversion to Kelvin");
      Temperature T = new Temperature(0,Temperature.Units.CELSIUS);
      T.changeUnits(Temperature.Units.KELVIN);
      System.out.println(T.toString());
      assertTrue(Math.abs(T.getValue() - 273.15) < 1e-6);
      assertTrue(T.getUnits() == Temperature.Units.KELVIN);
   }

   // Check Conversion to Fahrenheit from Celsius, 0 C (freezing temperature of water)
   // is chosen due to it being mentioned as an example in the code
   @Test
   public void test_celsiusToFahrenheit (){
      System.out.println("Test Temperature's conversion to Fahrenheit");
      Temperature T = new Temperature(0,Temperature.Units.CELSIUS);
      T.changeUnits(Temperature.Units.FAHRENHEIT);
      System.out.println(T.toString());
      assertTrue(Math.abs(T.getValue() - 32) < 1e-6);
      assertTrue(T.getUnits() == Temperature.Units.FAHRENHEIT);
   }  

   // Check Conversion to Fahrenheit from Kelvin, 0 K (Absolute Zero)
   // is chosen due to it being a common temp in Kelvin
   @Test
   public void test_kelvinToFahrenheit (){
      System.out.println("Test Temperature's conversion to Fahrenheit");
      Temperature T = new Temperature(0,Temperature.Units.KELVIN);
      T.changeUnits(Temperature.Units.FAHRENHEIT);
      System.out.println(T.toString());
      assertTrue(Math.abs(T.getValue() + 459.67) < 1e-6);
      assertTrue(T.getUnits() == Temperature.Units.FAHRENHEIT);
   }

   // Check Conversion to Celsius from Kelvin, 0 K (Absolute Zero)
   // is chosen due to it being a common temp in Kelvin
   @Test
   public void test_calvinToCelsius (){
      System.out.println("Test Temperature's conversion to Fahrenheit");
      Temperature T = new Temperature(0,Temperature.Units.KELVIN);
      T.changeUnits(Temperature.Units.CELSIUS);
      System.out.println(T.toString());
      assertTrue(Math.abs(T.getValue() + 273.15) < 1e-6);
      assertTrue(T.getUnits() == Temperature.Units.CELSIUS);
   }
}
