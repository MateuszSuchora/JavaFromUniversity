
package RepetytoriumJavaKlasy;

public class Main {

    public static void main(String[] args) {
        
        ArrayManager<Produkt> produkty = new ArrayManager<>(10);
        
        Produkt car1=new Car(100,"aa","aa","aa");
        Produkt car2=new Car(100,"aa","aa","aa");
        Produkt veh1=new Vehicle(100,"aa","aa");
        Produkt veh2=new Vehicle(100,"aa","aa");
        Produkt mot1= new Motocycle("aa",100,"aa","aa");
        Produkt mot2= new Motocycle("aa",100,"aa","aa");
       produkty.insert(car1);
       produkty.insert(car2);
       produkty.insert(veh1);
       produkty.insert(veh2);
       produkty.insert(mot1);
       produkty.insert(mot2);
       
       for(int i=0;i<6;i++){
           System.out.println(produkty.get(i).toString());
       }
       
       System.out.println(produkty.toString());
    }
    
}
