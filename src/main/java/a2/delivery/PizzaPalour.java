package a2.delivery;

public class PizzaPalour extends Delivery{
    public PizzaPalour(String address, String details, int number){
        // explicit call to superclass' parameterized constructor
        super(address, details,number);
    }
}


