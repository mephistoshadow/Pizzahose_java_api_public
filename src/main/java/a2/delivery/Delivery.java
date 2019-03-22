package a2.delivery;
import java.io.FileWriter;
import java.io.IOException;

public abstract class  Delivery {
    private String Address;
    private String Details;
    private int Number;

    public void setDetails(String address, String details, int number){
        this.Address=address;
        Details = details;
        Number = number;

    }

    public void GetOrderDetail(){

    }



}
