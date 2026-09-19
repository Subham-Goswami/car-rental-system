public class LuxuryCar extends Car {

    public LuxuryCar(String carId, String brand, double pricePerDay) {

        super(carId, brand, pricePerDay);
    }

    @Override
    public double calculateRent(int days) {

        return (days * pricePerDay) + 5000;
    }
}