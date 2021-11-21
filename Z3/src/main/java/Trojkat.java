import java.lang.Math; 

public class Trojkat {
    private Punkt punkt1;
    private Punkt punkt2;
    private Punkt punkt3;
    private double pole;
    private double obwod;

    public Trojkat(Punkt punkt1, Punkt punkt2, Punkt punkt3) {
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
        this.punkt3 = punkt3;
        setPole();
        setObwod();
    }

    public Punkt getPunkt1() {
        return punkt1;
    }

    public void setPunkt1(Punkt punkt1) {
        this.punkt1 = punkt1;
        setPole();
        setObwod();
    }

    public Punkt getPunkt2() {
        return punkt2;
        
    }

    public void setPunkt2(Punkt punkt2) {
        this.punkt2 = punkt2;
        setPole();
        setObwod();
    }

    public Punkt getPunkt3() {
        return punkt3;
    }

    public void setPunkt3(Punkt punkt3) {
        this.punkt3 = punkt3;
        setPole();
        setObwod();
    }

    public double getPole() {
        return pole;
    }

    public double getObwod() {
        return obwod;
    }
    private void setPole(){
        Odcinek o1= new Odcinek(punkt1,punkt2);
        Odcinek o2= new Odcinek(punkt2,punkt3);
        Odcinek o3= new Odcinek(punkt1,punkt3);
        double a=o1.getDlugosc();
        double b=o2.getDlugosc();
        double c=o3.getDlugosc();
        double p=(a+b+c)/2;
        pole=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        
    }
    private void setObwod(){
        Odcinek o1= new Odcinek(punkt1,punkt2);
        Odcinek o2= new Odcinek(punkt2,punkt3);
        Odcinek o3= new Odcinek(punkt1,punkt3);
        double a=o1.getDlugosc();
        double b=o2.getDlugosc();
        double c=o3.getDlugosc();
        obwod=a+b+c;
    }
    public void wyswietl(){
        System.out.println("Trojkat tworza punkty ");
        punkt1.wypisz();
        System.out.println(" , ");
        punkt2.wypisz();
        System.out.println(" i ");
        punkt3.wypisz();
        System.out.println("o obwodzie rownym:"+getObwod()+" i polu rownym:"+getPole());
        
    }
}
