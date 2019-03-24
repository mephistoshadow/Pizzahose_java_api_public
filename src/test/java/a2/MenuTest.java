//package a2;
//import a2.items.*;
//import a2.topping.Olives;
//import org.junit.Test;
//import org.junit.Assert;
//import org.junit.Test;
//import a2.Pizza.PizzaFactory;
//
//public class MenuTest {
//    @Test
//    public void testSetFilePath() {
//        Menu df=new Menu(System.getProperty("user.dir")+"/menu.json");
//        df.setFile(System.getProperty("user.dir")+"/menu.json");
//        String file=df.getFile();
//        Assert.assertEquals(file,System.getProperty("user.dir")+"/menu.json");
//    }
//    @Test
//    public void testGetFilePath() {
//        Menu df=new Menu(System.getProperty("user.dir")+"/menu.json");
//        String file=df.getFile();
//        Assert.assertEquals(file,System.getProperty("user.dir")+"/menu.json");
//    }
//
//    @Test
//    public void testChangeToppingPrice() {
//        Olives olive=new Olives();
//        Menu df=new Menu(System.getProperty("user.dir")+"/menu.json");
//        df.changeToppingPrice("olives",1.2);
//        Double price =df.getToppingPrice("olives",olive);
//        Assert.assertEquals((Double) 1.2,price);
//
//    }
//    @Test
//    public void testChangePizzaPrice() {
//        PizzaFactory pf=new PizzaFactory();
//        =pf.getPizza("pepperoni");
//
//        Menu df=new Menu(System.getProperty("user.dir")+"/menu.json");
//        df.changeToppingPrice("olives",1.2);
//        Double price =df.getPizzaPrice();
//        Assert.assertEquals((Double) 1.2,price);
//
//    }
//}
