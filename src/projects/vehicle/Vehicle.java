package projects.vehicle;

public abstract class Vehicle {

    protected String regNo;
    protected String model;
    protected double rate;

    public Vehicle(String regNo, String model, double rate) {
        this.regNo = regNo;
        this.model = model;
        this.rate = rate;
    }

    public abstract double calculateRentalCost(int daysOrHours, int mileage);
}
