package a2.delivery;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Iterator;
import java.io.File;
import com.opencsv.CSVWriter;



public class Foodora extends Delivery{


    public Foodora(String address, String details, int number){
        // explicit call to superclass' parameterized constructor
        super(address, details,number);
    }
    @Override
    public void saveOrderDetail(){
        //read from csv file
        int number=getOrderNumber();
        String filePath=System.getProperty("user.dir")+"/"+number+".csv";
        System.out.println(filePath);
        File file = new File(filePath);
        try {
            // create FileWriter object with file as parameter
            FileWriter outputfile = new FileWriter(file);
            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);

            // add data to csv
            String address=getOrderAddress();
            String[] data1 = { "Address:",address};
            System.out.println(address);
            writer.writeNext(data1);
            String Details=getOrdeDetail();
            String[] data2 = { "Order Details:", Details };
            writer.writeNext(data2);
            String[] data3 = { "Order Number:", Integer.toString(number)};
            writer.writeNext(data3);
            // closing writer connection
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }




    }

}
