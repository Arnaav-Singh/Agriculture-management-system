package src.services;

public class MarketPriceService {
    public double getMarketPrice(String cropName) {
        // Placeholder: This should fetch real data, but here is a mock price
        if (cropName.equalsIgnoreCase("wheat")) {
            return 20.5;
        } else if (cropName.equalsIgnoreCase("rice")) {
            return 25.0;
        }
        return 0.0;  // Default value if crop name not found
    }
}
