package src.models;

public class Farmer {
    private String name;
    private String contact;
    private String location;

    public Farmer(String name, String contact, String location) {
        this.name = name;
        this.contact = contact;
        this.location = location;
    }

    public String getName() { return name; }
    public String getContact() { return contact; }
    public String getLocation() { return location; }

    public void setName(String name) { this.name = name; }
    public void setContact(String contact) { this.contact = contact; }
    public void setLocation(String location) { this.location = location; }
}
