public class Customer {
    private String customerId;
    private String name;
    private int loyaltypoints;

    public Customer(String customerId,String name){
        this.customerId = customerId;
        this.name = name;
        this.loyaltypoints = 0;
    }

    public void addPoints(int points){
        loyaltypoints += points;

    }

    public void displayCustomerInfo(){
        System.out.println("Customr ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Loyalty Points: " + loyaltypoints);
    }
}