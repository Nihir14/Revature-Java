package projects.vehicle;

public class Truck extends Vehicle {

    public Truck(String regNo, String model, double rate) {
        super(regNo, model, rate);
    }

    @Override
    public double calculateRentalCost(int days, int mileage) {
        return (days * rate) + (mileage * 5);
    }
}

