package a2.delivery;
import java.io.FileWriter;
import java.io.IOException;

public class  Delivery {
    private String Address;
    private String Details;
    private int Number;

    public Delivery(String address, String details, int number) {
        this.Number = number;
        this.Details = details;
        this.Address = address;
    }

    public void setNumber(int number){

        this.Number = number;
    }

    public int getOrderNumber(){
        return Number;

    }
    public void setDetails(String details){
        this.Details = details;

    }
    public void setAddress(String Address){

        this.Address = Address;
    }

    public String getOrderAddress(){
        return Address;

    }
    public String getOrdeDetail(){
        return Details;

    }
    public void saveOrderDetail(){
        System.out.println("default");

    }


}
