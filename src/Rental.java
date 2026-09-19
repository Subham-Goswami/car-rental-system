public class Rental {

    private Car car;
    private Customer customer;
    private int days;

    // Constructor
    public Rental(Car car, Customer customer, int days) {

        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    // Display rental details
    public void displayRentalDetails() {

        System.out.println("\nRental Information");
        System.out.println("----------------------");

        car.displayCarInfo();

        customer.displayCustomerInfo();

        System.out.println("Rental Days: " + days);

        double total = car.calculateRent(days);

        System.out.println("Total Price: ₹" + total);
    }
}