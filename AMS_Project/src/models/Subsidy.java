package src.models;

public class Subsidy {
    private String subsidyName;
    private double amount;
    private String purpose;

    public Subsidy(String subsidyName, double amount, String purpose) {
        this.subsidyName = subsidyName;
        this.amount = amount;
        this.purpose = purpose;
    }

    public String getSubsidyName() { return subsidyName; }
    public double getAmount() { return amount; }
    public String getPurpose() { return purpose; }

    public void setSubsidyName(String subsidyName) { this.subsidyName = subsidyName; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setPurpose(String purpose) { this.purpose = purpose; }
}
