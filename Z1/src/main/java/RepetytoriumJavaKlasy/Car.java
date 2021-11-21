
package RepetytoriumJavaKlasy;

public class Car extends Vehicle{
    private String carBody;

    public Car(double price, String brand, String model, String carBody) {
        super(price, brand, model);
        this.carBody = carBody;
    }
    
    @Override
    public double calculateBargainPrice(){
        double x=super.calculateBargainPrice();
         return x*100/95*0.85;
     }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    @Override
    public String toString() {
        return "Car{"+ super.toString()+ "carBody=" + carBody + '}';
    }
    
    
}