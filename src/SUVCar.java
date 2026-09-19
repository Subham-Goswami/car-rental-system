public class SUVCar extends Car {
    public SUVCar(String carId, String brand, double pricePerDay)
    {
      super(carId, brand, pricePerDay);
    }

    @Override
    public double calculateRent(int days) {
        return(days * pricePerDay) + 2000;
    }

}