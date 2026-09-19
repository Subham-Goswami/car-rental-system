import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner object
        Scanner sc = new Scanner(System.in);

        // Create system
        CarRentalSystem system = new CarRentalSystem();

        // Create Cars
        Car car1 = new LuxuryCar("L101", "BMW", 10000);
        Car car2 = new SUVCar("S101", "Mahindra Scorpio", 5000);
        Car car3 = new EconomyCar("E101", "Tata Punch", 2000);

        // Add cars
        system.addCar(car1);
        system.addCar(car2);
        system.addCar(car3);

        // Welcome Message
        System.out.println("================================");
        System.out.println("   WELCOME TO CAR RENTAL SYSTEM ");
        System.out.println("================================");

        // Show available cars
        system.displayAvailableCars();

        // Take customer name
        System.out.print("\nEnter Your Name: ");
        String name = sc.nextLine();

        // Create customer
        Customer customer1 = new Customer("C001", name);

        // Choose car
        System.out.println("\nChoose Car:");
        System.out.println("1. BMW");
        System.out.println("2. Scorpio");
        System.out.println("3. Tata Punch");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        // Rental days
        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        // Selected car
        Car selectedCar = null;

        // Choice logic
        switch(choice) {

            case 1:
                selectedCar = car1;
                break;

            case 2:
                selectedCar = car2;
                break;

            case 3:
                selectedCar = car3;
                break;

            default:
                System.out.println("Invalid Choice");
                System.exit(0);
        }

        // Rent car
        system.rentCar(selectedCar, customer1, days);

        // Return process
        System.out.print("\nEnter Late Days (0 if none): ");
        int lateDays = sc.nextInt();

        system.returnCar(selectedCar, lateDays);

        // Closing scanner
        sc.close();

        System.out.println("\nThank You For Using Our Service!");
    }
}