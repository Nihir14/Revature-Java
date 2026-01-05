package projects.vehicle;

public class Car extends Vehicle {

    public Car(String regNo, String model, double rate) {
        super(regNo, model, rate);
    }

    @Override
    public double calculateRentalCost(int days, int mileage) {
        return days * rate;
    }
}
