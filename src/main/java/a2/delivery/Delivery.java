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

    public void setNumber(String address, String details, int number){
        this.Number = number;
    }

    public int GetOrderNumber(){
        return Number;

    }
    public void setDetails(String details){
        this.Details = details;

    }
    public void setAddress(String Address){

        this.Address = Address;
    }

    public String GetOrderAddress(){
        return Address;

    }
    public String GetOrdeDetail(){
        return Details;

    }


}
