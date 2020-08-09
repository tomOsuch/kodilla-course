package com.kodilla.testing.weather.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeatherForecastTestSuite {

    @Test
    void testCalculateForecastWithStub() {
        //Give
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);
        //When
        int quantityOfSensor = weatherForecast.calculateForecast().size();
        //Then
        Assertions.assertEquals(5, quantityOfSensor);
    }
}
