package com.junit.temperatureconvertor;

public class TemperatureConverter {

    // Converts temperature from Celsius to Fahrenheit.
    public double celsiusToFahrenheit(double celsius) {
        // returning the result in fahrenheit
        return (celsius * 9/5) + 32;
    }

    // Converts temperature from Fahrenheit to Celsius.
    public double fahrenheitToCelsius(double fahrenheit) {
        // returning the result in Celsius
        return (fahrenheit - 32) * 5/9;
    }
}
