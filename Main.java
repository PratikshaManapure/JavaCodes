import java.util.ArrayList;
import java.util.List;

class Cake{
   String name;
   float price;

   public String getName(){
      return name;
   }
   public void setName(String name) {
        this.name = name;
    }
     public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
     public void display(){
        System.out.println(name + ": \u20B9 " + price + " per pound");
    }
}

class Pastry extends Cake{

    
    public void display(){
        System.out.println(name + ": \u20B9" + price + " per piece");   
    }
}  
class Main{  
public static void main(String args[]){  
     Cake c1 = new Cake();
        c1.name = "Chocolate Brownie";
        c1.price = 250;
        Cake c2 = new Cake();
        c2.name = "Chocolate Maple";
        c2.price = 300;

        List<Cake> cakesName = new ArrayList<>();
        cakesName.add(c1);
        cakesName.add(c2);

        Pastry p1 = new Pastry();
        p1.name = "Black Forest";
        p1.price = 35;
        Pastry p2 = new Pastry();
        p2.name = "Choco Truffle";
        p2.price = 40;
          List<Pastry> pastryNames = new ArrayList<>();
        pastryNames.add(p1);
        pastryNames.add(p2);

        System.out.println("Today's Special Menu");
        System.out.println("---------------------");
        System.out.println("special cakes");
        System.out.println("---------------------");
        
        for (Cake cake: cakesName) {
            cake.display();
        }
            System.out.println("Special Pastries");
        System.out.println("---------------------");

        for (Pastry pastry: pastryNames){
            pastry.display();
        }




  
}
}
