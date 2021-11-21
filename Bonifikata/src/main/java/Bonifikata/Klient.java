
package Bonifikata;

public class Klient{
   private String imie, nazwisko;
   private double pesel;
   private double przychody_roczne;
   private double dochody;
   private String []miejsca_pracy;

    public Klient(String imie, String nazwisko, double pesel, double przychody_roczne, double dochody, String[] miejsca_pracy) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.przychody_roczne = przychody_roczne;
        this.dochody = dochody;
        this.miejsca_pracy = miejsca_pracy;
    }

    
    public double getPesel() {
        return pesel;
    }

    public double getDochody() {
        return dochody;
    }
   public void Visit(Visitor visitor)
        {
            visitor.VisitElement(this);
        }
    

    @Override
    public String toString() {
        return "Klient{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", pesel=" + pesel + ", przychody_roczne=" + przychody_roczne + ", dochody=" + dochody + ", miejsca_pracy=" + miejsca_pracy + '}';
    }
   
   
}
