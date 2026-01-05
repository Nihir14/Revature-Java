package projects.vehicle;

public class Motorcycle extends Vehicle {

    public Motorcycle(String regNo, String model, double rate) {
        super(regNo, model, rate);
    }

    @Override
    public double calculateRentalCost(int hours, int mileage) {
        return hours * rate;
    }
}
