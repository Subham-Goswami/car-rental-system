public class Car{
    protected String carId;
    protected String brand;
    protected double pricePerDay;
    protected boolean isAvailable;
    protected int fuelLevel;

    public Car(String carID, String brand, double pricePerDay){
        this.carId = carId;
        this.brand = brand;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true;
        this.fuelLevel = 100;

    }

    public void displayCarInfo(){
        System.out.println("car Id: " + carId);
        System.out.println("Brand: " + brand);
        System.out.println("Price Per Day: ₹" + pricePerDay);
        System.out.println("Available: " + isAvailable);
        System.out.println("Fuel Level: " + fuelLevel + "%");
    }

    public double calculateRent(int days){
        return days * pricePerDay;
    }
}
