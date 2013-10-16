/** 
 * @author Aditya Mahajan <aditya.mahajan@mcgill.ca>
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
      assertTrue(Math.abs(T.getValue()) < 0.0001);
   }

   // Check Conversion to Kelvin, 0 C (freezing temperature of water)
   // is chosen due to it being mentioned as an example in the code
   @Test
   public void test_iceToKelvin (){
      System.out.println("Test Temperature's conversion to Kelvin");
      Temperature T = new Temperature(0,Temperature.Units.CELSIUS);
      T.changeUnits(Temperature.Units.KELVIN);
      System.out.println(T.toString());
      assertTrue(Math.abs(T.getValue() - 273.15) < 0.0001);
   }

   // Check Conversion to Fahrenheit, 0 C (freezing temperature of water)
   // is chosen due to it being mentioned as an example in the code
   @Test
   public void test_iceToFahrenheit (){
      System.out.println("Test Temperature's conversion to Fahrenheit");
      Temperature T = new Temperature(0,Temperature.Units.CELSIUS);
      T.changeUnits(Temperature.Units.FAHRENHEIT);
      System.out.println(T.toString());
      assertTrue(Math.abs(T.getValue() - 32) < 0.0001);
   }  

   // Check toString to Fahrenheit, 0 C (freezing temperature of water)
   // is chosen due to it being mentioned as an example in the code
   // Fahrenheit is chosen as floating point errors often occur.
   @Test
   public void test_printIceFahrenheit (){
      System.out.println("Test Temperature's toString");
      Temperature T = new Temperature(0,Temperature.Units.CELSIUS);
      T.changeUnits(Temperature.Units.FAHRENHEIT);
      System.out.println(T.toString());
      assertTrue(T.toString() == "32.0 °F");
   }  
  // @Test
  // public void .... (){
  //    ...
  // }
}
