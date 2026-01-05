package projects.vehicle;

public class RentalDemo {
    public static void main(String[] args) {

        Vehicle car = new Car("C01", "Honda", 1000);
        Vehicle bike = new Motorcycle("M01", "Yamaha", 100);
        Vehicle truck = new Truck("T01", "Tata", 2000);

        System.out.println(car.calculateRentalCost(3, 0));
        System.out.println(bike.calculateRentalCost(5, 0));
        System.out.println(truck.calculateRentalCost(2, 50));
    }
}
