package model;

public class Farmer {
    private String name;
    private String region;
    private String contact;

    public Farmer(String name, String region, String contact) {
        this.name = name;
        this.region = region;
        this.contact = contact;
    }

    // Getters and setters
    public String getName() { return name; }
    public String getRegion() { return region; }
    public String getContact() { return contact; }
}
