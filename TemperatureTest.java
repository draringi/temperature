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

   @Test
   public void test_getTemperature (){
      System.out.println("Test Temperature's getValue funtion");
      Temperature T = new Temperature(0,Temperature.Units.CELSIUS);
      assertTrue(T.getValue() == 0.0);
   }

   @Test
   public void test_toKelvin (){
      System.out.println("Test Temperature's conversion to Kelvin");
      Temperature T = new Temperature(0,Temperature.Units.CELSIUS);
      T.changeUnits(Temperature.Units.KELVIN);
      assertTrue(T.getValue() == 273.15);
   }


  // @Test
  // public void .... (){
  //    ...
  // }
}
