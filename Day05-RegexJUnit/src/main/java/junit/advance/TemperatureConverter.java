package junit.advance;

public class TemperatureConverter {
    public double celsiusToFahrenheit(double celsius){
        double fahrenheit = (celsius * ((double)9/5))+32;
        return Math.round(fahrenheit*100.0)/100.0;

    }
    public double fahrenheitToCelsius(double fahrenheit){
        double celsius = (fahrenheit-32) *(double)5/9;
        return Math.round(celsius*100.0)/100.0;
    }
}
