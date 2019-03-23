package a2.items;

import a2.Pizza.Pizza;
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
        BufferedReader br = null;
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(priceFILE));
            JSONObject jsonObject = (JSONObject) obj;
            JSONObject DrinkJson = (JSONObject) jsonObject.get("Drink");

            Set keys  = DrinkJson.keySet();
            Iterator<String> iteraterD=keys.iterator();
            while (iteraterD.hasNext()){
                String name =iteraterD.next();
                Long priceL=(Long) DrinkJson.get(name);
                double price = priceL.doubleValue();
                Drinks.put(name, price);
            }
            JSONObject  PizzaJson = (JSONObject) jsonObject.get("Pizza");
            Set keysP  = PizzaJson.keySet();
            Iterator<String> iteraterP=keysP.iterator();
            while (iteraterP.hasNext()){
                String name =iteraterP.next();
                Long priceL=(Long) PizzaJson.get(name);
                double price = priceL.doubleValue();
                Pizzas.put(name, price);

            }

            JSONObject  ToppingJson = (JSONObject) jsonObject.get("Topping");
            Set keysT  = ToppingJson.keySet();
            Iterator<String> iteraterT=keysT.iterator();
            while (iteraterT.hasNext()){
                String name =iteraterT.next();
                Long priceL=(Long) ToppingJson.get(name);
                double price = priceL.doubleValue();
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
    public void setFilePath(String filePath){
        this.filePath=filePath;

    }

    public void changePizzaPrice(String item, Double price){
        Pizzas.put(item,price);

    }
    public Double getPizzaPrice(String item){
        Double price=Pizzas.get(item);
        return price;

    }
    public void changeToppingPrice(String item, Double price){
        Toppings.put(item,price);

    }
    public Double getToppingPrice(String item){
        Double price=Toppings.get(item);
        return price;

    }

    public void changeDrinkPrice(String item, Double price){
        Drinks.put(item,price);

    }
    public Double getDrinkPrice(String item){
        Double price=Drinks.get(item);
        return price;

    }
    public void SaveMenu(){
        JSONObject obj = new JSONObject();
        JSONObject Drink = new JSONObject();
        for(HashMap.Entry<String,Double> entry : Drinks.entrySet()){
            Drink.put(entry.getKey(), entry.getValue());
        };
        obj.put("Drink",Drink);

        JSONObject Pizza = new JSONObject();
        for(HashMap.Entry<String,Double> entry : Pizzas.entrySet()){

            Pizza.put(entry.getKey(), entry.getValue());

        };
        obj.put("Pizza",Pizza);
        JSONObject Topping = new JSONObject();
        for(HashMap.Entry<String,Double> entry : Toppings.entrySet()){

            Topping.put(entry.getKey(), entry.getValue());

        };
        obj.put("Topping",Topping);
        try{
            FileWriter file = new FileWriter(filePath);
            file.write(obj.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getMenu(){
        System.out.println("Pizzas");
        System.out.println(Pizzas);
        System.out.println("Toppings");
        System.out.println(Toppings);
        System.out.println("Drinks");
        System.out.println(Drinks);

    }

    public static void main(String[] args) {

        System.out.println("Welcome to 301 Pizza!: ");
        Menu menu=new Menu("/Users/yufei/Desktop/2019winter/CSC301/assignment/pair49-yangsiq1-yangyu35/src/main/java/a2/items/menu.json");
        menu.getMenu();

//        String pizzaPrice="-\npepperoni:small:12.1\n,pepperoni:small:12.1-\nCoke:1,Diet Coke:1,";
//        String[] pizzaS=pizzaPrice.split("-\n");
//        System.out.println(pizzaS[1]);

    }


}
