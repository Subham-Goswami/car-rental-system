import java.util.ArrayList;

public class CarRentalSystem {

    // ArrayLists
    ArrayList<Car> cars = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Rental> rentals = new ArrayList<>();

    // Add Car
    public void addCar(Car car) {

        cars.add(car);
    }

    // Add Customer
    public void addCustomer(Customer customer) {

        customers.add(customer);
    }

    // Display Available Cars
    public void displayAvailableCars() {

        System.out.println("\nAvailable Cars:");
        System.out.println("---------------------");

        for (Car car : cars) {

            if (car.isAvailable) {

                car.displayCarInfo();
                System.out.println("---------------------");
            }
        }
    }

    // Rent Car
    public void rentCar(Car car, Customer customer, int days) {

        if (car.isAvailable) {

            car.isAvailable = false;

            Rental rental = new Rental(car, customer, days);

            rentals.add(rental);

            System.out.println("\nCar Rented Successfully!");

            rental.displayRentalDetails();

        } else {

            System.out.println("\nCar is not available.");
        }
    }

    // Return Car
    public void returnCar(Car car, int lateDays) {

        car.isAvailable = true;

        System.out.println("\nCar Returned Successfully!");

        if (lateDays > 0) {

            double fine = lateDays * 1000;

            System.out.println("Late Fine: ₹" + fine);
        }
    }
}