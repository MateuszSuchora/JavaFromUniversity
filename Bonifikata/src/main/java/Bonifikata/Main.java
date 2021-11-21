package Bonifikata;

public class Main {

    
    public static void main(String[] args) {
        double przych=1000;
        double przych2=10000000;
        double doch=1000;
        String[] miej={"Lublin, Krasnik"};
        double pesel=99012220123.0;
        double pesel2=92010100000.0;
        
        Klient klient=new Klient("Jan", "Kowalski",pesel ,przych,doch,miej);
        Klient klient2=new Klient("Anna", "Nowacka",pesel2 ,przych2,doch,miej);

        Klient[] klienci={klient,klient2};
        Bonifikata1 b1=new Bonifikata1(klienci);
        System.out.println("Poszlo 1");
        Bonifikata2 b2=new Bonifikata2(klienci);
        System.out.println("Poszlo 2");
        Bonifikata3 b3=new Bonifikata3(klienci);
        System.out.println("Poszlo 3");
        Bonifikata4 b4=new Bonifikata4(klienci);
        System.out.println("Poszlo 4");
        Bonifikata5 b5=new Bonifikata5(klienci);
        System.out.println("Poszlo 5");
        BonifikataVip bVip=new BonifikataVip(klienci);
        System.out.println("Poszlo 6");
        Bonifikata bon=new Bonifikata(b1,b2,b3,b4,b5,bVip);
        System.out.println(bon.toString());
        
        
        klient.Visit(new VisitorJSON());
        klient.Visit(new VisitorXML());
        
    }
    
}
