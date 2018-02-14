/************************************************
TemperatureConverter.java
Isabel Rodriguez Gonzalez

This program converts from Fahrenheit to Celcius
*************************************************/
public class TemperatureConverter{
    public static void main(String[]args){
      final double FREEZING_POINT=32.0;
        final double CONVERSION_FACTOR=5.0/9.0;
          double faherenheit=50;
          double celcius=0;
          celcius=CONVERSION_FACTOR*(faherenheit-FREEZING_POINT);
          System.out.println(faherenheit+"degrees Faherenheit="+celcius+"degrees Celcius");
    }//end main
}//end TemperatureConver
