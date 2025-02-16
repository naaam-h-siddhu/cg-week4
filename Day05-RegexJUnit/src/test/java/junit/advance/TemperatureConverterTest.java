package junit.advance;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    TemperatureConverter temperatureConverter = new TemperatureConverter();

    @Test
    void celsiusToFahrenheit() {
        double celsius = 37.0;
        assertEquals(98.60, temperatureConverter.celsiusToFahrenheit(celsius));
    }

    @Test
    void fahrenheitToCelsius() {
        double farhrenheit = 98.60;
        assertEquals(37.00,temperatureConverter.fahrenheitToCelsius(farhrenheit));
    }
     @AfterEach
    void tearDown(){
         System.out.println("✅ Test Passed !!");
     }
}