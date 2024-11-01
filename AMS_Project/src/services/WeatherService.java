package src.services;

import src.models.WeatherData;

public class WeatherService {
    public WeatherData getWeatherData(String location) {
        // Placeholder: This should fetch data from an actual weather API
        return new WeatherData(25.0, 60.0, "Sunny");
    }
}
