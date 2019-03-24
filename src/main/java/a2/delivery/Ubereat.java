package a2.delivery;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;


public class Ubereat extends Delivery{

    public Ubereat(String address, String details, int number){
        // explicit call to superclass' parameterized constructor
        super(address, details,number);
    }
    public void saveOrderDetail(){
        //read from json file
        int number=getOrderNumber();
        String filePath=System.getProperty("user.dir")+"/"+number+".json";
        JSONObject DeliveryDetails = new JSONObject();
        String Address=getOrderAddress();
        DeliveryDetails.put("Address:", Address);
        String Details=getOrdeDetail();
        DeliveryDetails.put("Order Details:", Details);
        DeliveryDetails.put("Order Number:", number);
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
