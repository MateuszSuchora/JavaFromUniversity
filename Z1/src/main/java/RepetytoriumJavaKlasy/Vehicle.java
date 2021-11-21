
package RepetytoriumJavaKlasy;

public class Vehicle extends Produkt{
    private String brand;
    private String model;
    
     public Vehicle(double price, String brand, String model) {
        super(price);
        this.brand = brand;
        this.model = model;
    }
    
    @Override
    public double calculateBargainPrice(){
         return super.calculateBargainPrice()*0.95;
     } 

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return  "brand=" + brand + ", model=" + model + "cena" + calculateBargainPrice();
    }
    
    
     
}
