package a2.delivery;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Iterator;
import java.io.File;
import com.opencsv.CSVWriter;



public class Foodora extends Delivery{
    private String Address;
    private String Details;
    private int Number;

    public Foodora(String address, String details, int number){
        // explicit call to superclass' parameterized constructor
        super(address, details,number);
    }

    public void saveOrderDetail(int orderNum){
        //read from csv file
        String filePath=System.getProperty("user.dir")+String.valueOf(orderNum)+".csv";
        File file = new File(filePath);
        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(file);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);

            // add data to csv
            String[] data1 = { "Address:",Address};
            writer.writeNext(data1);
            String[] data2 = { "Order Details:", Details };
            writer.writeNext(data2);

            String[] data3 = { "Order Number:", String.valueOf(Number)};
            writer.writeNext(data3);

            // closing writer connection
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }




    }

}
