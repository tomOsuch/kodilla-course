package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        double sum = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }

        return sum/temperatures.getTemperatures().size();
    }

    public double calculateMedianTemperature() {
        List<Double> sortTemperature = new ArrayList<>(temperatures.getTemperatures().values());
        int sizeList = sortTemperature.size();
        double median;
        Collections.sort(sortTemperature);
        if (sortTemperature.size() % 2 != 0) {
            median = sortTemperature.get((sizeList - 1) / 2);
        } else {
            median = (sortTemperature.get(sizeList/2 - 1) + sortTemperature.get(sizeList/2)) / 2;
        }

        return median;
    }
}
