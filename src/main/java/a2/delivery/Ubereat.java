package a2.delivery;

import org.json.simple.JSONObject;
import java.io.IOException;
import java.io.FileWriter;


public class Ubereat extends Delivery{
    private String Address;
    private String Details;
    private int Number;

    public Ubereat(String address, String details, int number){
        // explicit call to superclass' parameterized constructor
        super(address, details,number);
    }

    public void saveDeliveryDetail(int orderNum){
        //read from csv file
        String filePath=System.getProperty("user.dir")+String.valueOf(orderNum)+".json";
        JSONObject DeliveryDetails = new JSONObject();
        DeliveryDetails.put("Address:", Address);
        DeliveryDetails.put("Order Details:", Details);
        DeliveryDetails.put("Order Number:", String.valueOf(Number) );
        try{
            //write to a file
            FileWriter file = new FileWriter(filePath);
            file.write(DeliveryDetails.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
