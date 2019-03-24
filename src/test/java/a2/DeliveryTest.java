package a2;

import a2.delivery.DeliveryFactory;
import a2.delivery.*;
import org.junit.Assert;
import org.junit.Test;
import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class DeliveryTest {
    
    @Test
    public void testSetNumber() {
        DeliveryFactory df=new DeliveryFactory();
        Delivery d1 =df.SetDelivery("Ubereat","home","coke",1);
        d1.setNumber(2);
        int num=d1.getOrderNumber();
        Assert.assertEquals(num,2);
    }

    @Test
    public void testGetNumber() {
        DeliveryFactory df=new DeliveryFactory();
        Delivery d1 =df.SetDelivery("Ubereat","home","coke",1);
        int num=d1.getOrderNumber();
        Assert.assertEquals(num,1);
    }

    @Test
    public void testSetAddress() {
        DeliveryFactory df=new DeliveryFactory();
        Delivery d1 =df.SetDelivery("Ubereat","home","coke",1);
        d1.setAddress("top sushi");
        String address=d1.getOrderAddress();
        Assert.assertEquals(address,"top sushi");
    }
    @Test
    public void testGetAddress() {
        DeliveryFactory df=new DeliveryFactory();
        Delivery d1 =df.SetDelivery("Ubereat","home","coke",1);
        String address=d1.getOrderAddress();
        Assert.assertEquals(address,"home");
    }

    @Test
    public void testSetDetails() {
        DeliveryFactory df=new DeliveryFactory();
        Delivery d1 =df.SetDelivery("Ubereat","home","coke",1);
        d1.setDetails("coke, peperoni");
        String detail=d1.getOrdeDetail();
        Assert.assertEquals(detail,"coke, peperoni");
    }

    @Test
    public void testGetDetails() {
        DeliveryFactory df=new DeliveryFactory();
        Delivery d1 =df.SetDelivery("Ubereat","home","coke",1);
        String detail=d1.getOrdeDetail();
        Assert.assertEquals(detail,"coke");
    }

    @Test
    public void testSaveFoodora() {
        DeliveryFactory df = new DeliveryFactory();
        Delivery d1 = df.SetDelivery("Foodora", "home", "coke", 1);
        d1.saveOrderDetail();

        File file = new File(System.getProperty("user.dir")+"/1.csv");
        try {

            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            String detail="";
            while ((st = br.readLine()) != null) {
                detail+=st;

            }
            Assert.assertEquals(detail,"\"Address:\",\"home\"\"Order Details:\",\"coke\"\"Order Number:\",\"1\"");

        } catch (IOException e) {

            // do something
            e.printStackTrace();
        }

    }

    @Test
    public void testSaveUbereat() {
        DeliveryFactory df = new DeliveryFactory();
        Delivery d1 = df.SetDelivery("Ubereat", "home", "coke", 1);
        d1.saveOrderDetail();
        File file = new File(System.getProperty("user.dir")+"/1.json");
        JSONParser jsonParser = new JSONParser();
        String detail="";
        try {
            FileReader reader = new FileReader(file);
            //Read JSON file
            JSONObject obj =(JSONObject) jsonParser.parse(reader);
            String address=(String) obj.get("Address:");
            String Details=(String) obj.get("Order Details:");
            Long number=(Long) obj.get("Order Number:");
            int num=number.intValue();
            detail=address+Details+num;
            Assert.assertEquals(detail,"homecoke1");
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
