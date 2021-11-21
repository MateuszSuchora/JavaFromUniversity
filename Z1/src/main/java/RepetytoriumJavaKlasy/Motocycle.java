
package RepetytoriumJavaKlasy;

public class Motocycle extends Vehicle{
    private String typeOfDrive;

    public Motocycle(String typeOfDrive, double price, String brand, String model) {
        super(price, brand, model);
        this.typeOfDrive = typeOfDrive;
    }
    @Override
    public double calculateBargainPrice(){
        double x=super.calculateBargainPrice();
         return x*100/95*0.9;
     }

    public String getTypeOfDrive() {
        return typeOfDrive;
    }

    public void setTypeOfDrive(String typeOfDrive) {
        this.typeOfDrive = typeOfDrive;
    }

    @Override
    public String toString() {
        return "Motocycle{" +super.toString()+ "typeOfDrive=" + typeOfDrive + '}';
    }
    
    
}
