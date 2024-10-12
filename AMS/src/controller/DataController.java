package controller;

import model.CropData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.json.JSONObject;

public class DataController {
    private List<CropData> cropDataList = new ArrayList<>();

    // Method to load crop data from a CSV file
    public void loadCropDataFromCSV(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String cropName = values[0];
                int quantity = Integer.parseInt(values[1]);
                double price = Double.parseDouble(values[2]);

                cropDataList.add(new CropData(cropName, quantity, price));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to get the list of crop data
    public List<CropData> getCropData() {
        return cropDataList;
    }

    // Weather API integration using OpenWeatherMap API
    public String getWeatherForecast(String region) {
        String apiKey = "6fb88fe4986875674cd6b934912cfabb";  // Replace this with your actual API key
        String urlString = "http://api.openweathermap.org/data/2.5/weather?q=" + region + "&appid=" + apiKey + "&units=metric";  // Metric units for temperature in Celsius

        try {
            // Establish a connection to the API URL
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            // Check if the request was successful
            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {
                // Parse the JSON response
                StringBuilder inline = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    inline.append(scanner.nextLine());
                }
                scanner.close();

                // Convert the string to JSON object
                JSONObject data = new JSONObject(inline.toString());

                // Get weather information
                JSONObject main = data.getJSONObject("main");
                double temp = main.getDouble("temp");

                return "Current weather in " + region + ": " + temp + "°C";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Weather data not available.";
    }
}
