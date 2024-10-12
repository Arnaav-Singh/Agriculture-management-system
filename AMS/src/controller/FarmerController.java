package controller;

import model.Farmer;
import java.util.ArrayList;
import java.util.List;

public class FarmerController {
    private List<Farmer> farmerList = new ArrayList<>();

    public void registerFarmer(String name, String region, String contact) {
        Farmer farmer = new Farmer(name, region, contact);
        farmerList.add(farmer);
    }

    public List<Farmer> getFarmers() {
        return farmerList;
    }
}
