package a2.items;

import a2.Pizza.Pizza;
import a2.drink.Drink;
import a2.topping.Topping;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.HashMap;


public class Menu {

    private HashMap<String, Double> Drinks = new HashMap<String, Double>();
    private HashMap<String, Double> Pizzas = new HashMap<String, Double>();
    private HashMap<String, Double> Toppings = new HashMap<String, Double>();
    private String filePath="";


    public Menu( String priceFILE){
        filePath=priceFILE;
        JSONParser parser = new JSONParser();
        //parse the json object to the hashmap
        try {
            Object obj = parser.parse(new FileReader(priceFILE));
            JSONObject jsonObject = (JSONObject) obj;
            JSONObject DrinkJson = (JSONObject) jsonObject.get("Drink");
            //get keys of the json object
            Set keys  = DrinkJson.keySet();
            Iterator<String> iteraterD=keys.iterator();
            //set drinks
            while (iteraterD.hasNext()){
                String name =iteraterD.next();
                Double priceL=(Double) DrinkJson.get(name);
                double price = priceL.doubleValue();
                Drinks.put(name, price);
            }
            JSONObject  PizzaJson = (JSONObject) jsonObject.get("Pizza");
            Set keysP  = PizzaJson.keySet();
            Iterator<String> iteraterP=keysP.iterator();
            //set pizza
            while (iteraterP.hasNext()){
                String name =iteraterP.next();
                Double price=(Double) PizzaJson.get(name);
                Pizzas.put(name, price);

            }
            //set topping
            JSONObject  ToppingJson = (JSONObject) jsonObject.get("Topping");
            Set keysT  = ToppingJson.keySet();
            Iterator<String> iteraterT=keysT.iterator();
            while (iteraterT.hasNext()){
                String name =iteraterT.next();
                Double price=(Double) ToppingJson.get(name);
                Toppings.put(name, price);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    // change pizza price
    public void changePizzaPrice(String item, Double price){
        Pizzas.put(item,price);

    }

    //add new type of pizza
    public void addNewPizza(String item, Double price){
        if(!Pizzas.containsKey(item)){
            Pizzas.put(item,price);
        }
        else{
            System.out.println("Pizza type already exist");
        }

    }
    public Double getPizzaPrice(String item, Pizza p){
        Double price=Pizzas.get(item);
        p.setPrice(price);
        return price;

    }

    public void setFile(String filePath){
        this.filePath=filePath;
    }

    public String getFile(){
        return filePath;

    }
    public void changeToppingPrice(String item, Double price){
        Toppings.put(item,price);

    }
    public Double getToppingPrice(String item, Topping t){
        Double price=Toppings.get(item);
        t.setPrice(price);
        return price;

    }

    public void changeDrinkPrice(String item, Double price){
        Drinks.put(item,price);

    }
    public Double getDrinkPrice(String item,Drink d){
        Double price=Drinks.get(item);
        d.setPrice(price);
        return price;

    }

    public void SaveMenu(){
        JSONObject obj = new JSONObject();
        //convert drink hashmap to json
        JSONObject Drink = new JSONObject();
        for(HashMap.Entry<String,Double> entry : Drinks.entrySet()){
            Drink.put(entry.getKey(), entry.getValue());
        };
        obj.put("Drink",Drink);
        //convert pizza hashmap to json
        JSONObject Pizza = new JSONObject();
        for(HashMap.Entry<String,Double> entry : Pizzas.entrySet()){

            Pizza.put(entry.getKey(), entry.getValue());

        };
        obj.put("Pizza",Pizza);
        //convert topping hashmap to json
        JSONObject Topping = new JSONObject();
        for(HashMap.Entry<String,Double> entry : Toppings.entrySet()){

            Topping.put(entry.getKey(), entry.getValue());

        };
        obj.put("Topping",Topping);
        try{
            //write to a file
            FileWriter file = new FileWriter(filePath);
            file.write(obj.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //print out the menu
    public void getMenu(){
        System.out.println("Pizzas");
        System.out.println(Pizzas);
        System.out.println("Toppings");
        System.out.println(Toppings);
        System.out.println("Drinks");
        System.out.println(Drinks);

    }



}
