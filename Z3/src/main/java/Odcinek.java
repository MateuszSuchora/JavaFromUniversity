import java.lang.Math; 
public class Odcinek {
    private Punkt punkt1;
    private Punkt punkt2;
    private double Dlugosc;

    public Punkt getPunkt1() {
        return punkt1;
    }

    public void setPunkt1(Punkt punkt1) {
        this.punkt1 = punkt1;
        setDlugosc();
    }

    public Punkt getPunkt2() {
        return punkt2;
    }

    public void setPunkt2(Punkt punkt2) {
        this.punkt2 = punkt2;
        setDlugosc();
    }

    public double getDlugosc() {
        return Dlugosc;
    }

    private void setDlugosc() {
        Dlugosc = Math.sqrt((getPunkt1().getX()-getPunkt2().getX())*(getPunkt1().getX()-getPunkt2().getX())+(getPunkt1().getY()-getPunkt2().getY())*(getPunkt1().getY()-getPunkt2().getY()));
    }

    public Odcinek(Punkt punkt1, Punkt punkt2) {
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
        setDlugosc();
    }
    public Odcinek() {}
    public Odcinek(double x1, double y1, double x2, double y2) {
        punkt1 = new Punkt(x1,y1);
        punkt2 = new Punkt(x2,y2);
        setDlugosc();
    }
    public void wyswietl(){
        System.out.println("Odleglosc miedzy punktami ");
        punkt1.wypisz();
        System.out.println(" i ");
        punkt2.wypisz();
        System.out.println("wynosi:"+getDlugosc());
        
    }
    
    static Punkt przeciecie(Odcinek o1, Odcinek o2){
        Punkt punkt1=o1.getPunkt1();
        Punkt punkt2=o1.getPunkt2();
        Punkt punkt3=o2.getPunkt1();
        Punkt punkt4=o2.getPunkt2();
        
        double x;
        double y;
        double a1=(punkt2.getY()-punkt1.getY())/(punkt2.getX()-punkt1.getX());
        double b1=punkt1.getY()-(a1*punkt1.getX());
        double a2=(punkt3.getY()-punkt4.getY())/(punkt3.getX()-punkt4.getX());
        double b2=punkt3.getY()-(a2*punkt3.getX());
        x=(b2-b1)/(a1-a2);
        y=(a1*x)+b1;
        Punkt pkt=new Punkt(x,y);
      
        return pkt;
        
    }
    
}
