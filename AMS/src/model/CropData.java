package model;

public class CropData {
    private String cropName;
    private int quantity;
    private double price;

    public CropData(String cropName, int quantity, double price) {
        this.cropName = cropName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and setters
    public String getCropName() { return cropName; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
}
