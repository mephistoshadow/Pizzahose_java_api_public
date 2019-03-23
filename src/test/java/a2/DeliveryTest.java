package a2;

import a2.delivery.DeliveryFactory;
import a2.delivery.*;
import org.junit.Assert;
import org.junit.Test;
import java.io.*;



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
        Delivery d1 = df.SetDelivery("Ubereat", "home", "coke", 1);
        d1.saveOrderDetail();
        String details = "Address:\n" + "Order Details:\n" + "Order Number:";

        File file = new File("1.csv");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }

        } catch {

        }
    }

    @Test
    public void testSaveUbereat() {


    }

    

}