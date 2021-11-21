
package kino;

public class Produkt {
    private double price;

    public Produkt(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    
     double calculateBargainPrice(){
         return price;
     }

    @Override
    public String toString() {
        return "Produkt{" + "price=" + price + '}';
    }
     
}
