import java.util.Scanner;
public class zadanie1 {
    
    public static void main(String[] args){
        
        //Samochod sam = new Samochod();
        //System.out.println(sam.marka);
//        Samochod sam = new Samochod( 1500, 1, 167, "audi");
//        System.out.println(sam.getMarka()+ " , "+sam.getCiezar()+" , "+sam.getWysokosc()+" , " );    
//        System.out.println(sam.getAktualna_predkosc());
//        sam.zwieksz_predkosc(200);
//        System.out.println(sam.getAktualna_predkosc());
          Scanner sc = new Scanner(System.in);
          String line = sc.next();
          double a1 = Double.parseDouble(line);
          String line2 = sc.next();
          double a2 = Double.parseDouble(line2);
          String line3 = sc.next();
          double a3 = Double.parseDouble(line3);
          String line4 = sc.next();
          double a4 = Double.parseDouble(line4);
          String line5 = sc.next();
          double a5 = Double.parseDouble(line5);
          String line6 = sc.next();
          double a6 = Double.parseDouble(line6);
          Punkt punkt1=new Punkt(a1,a2);
          Punkt punkt2=new Punkt(a3,a4);
          Punkt punkt3=new Punkt(a5,a6);
          
          punkt1.wypisz();
          punkt2.wypisz();
          punkt3.wypisz();
          Odcinek oc1= new Odcinek(punkt1,punkt2);
          Odcinek oc2= new Odcinek(punkt2,punkt3);
          Odcinek oc3= new Odcinek(punkt1, punkt3);
          oc1.wyswietl();
          oc2.wyswietl();
          oc3.wyswietl();
          
          Trojkat tr=new Trojkat(punkt1,punkt2, punkt3);
          tr.wyswietl();
          
          String line7 = sc.next();
          double a7 = Double.parseDouble(line7);
          String line8 = sc.next();
          double a8 = Double.parseDouble(line8);
          Punkt punkt4=new Punkt(a7,a8);
          tr.setPunkt1(punkt4);
          Odcinek oc4= new Odcinek(punkt4,punkt2);
          Odcinek oc5= new Odcinek(punkt4, punkt3);
          oc2.wyswietl();
          oc4.wyswietl();
          oc5.wyswietl();
          Punkt pkt=Odcinek.przeciecie(oc1,oc2);
          System.out.println("Przeciecie w punkcie:");
          pkt.wypisz();
    }

}
