
package Bonifikata;

public class Bonifikata3 extends CompositeKlient{
     private int[] bon;
     
     public int getBon(int i) {
        return bon[i];
    }

    
    public Bonifikata3( Klient[] lista) {
        super(lista);
        this.bon=new int[super.getRozmiar()];
        for(int i=0; i<super.getRozmiar();i++ ){
            double x=super.getKlientPesel(i);
            double dzien=x%10000000-x%100000;
            double miesiac=x%1000000000-x%10000000;
            double rok=x-x%1000000000;
            if(dzien==27 && miesiac==11 && rok==99)//tu powinno byc porownywanie z data dzisiejsza 
                bon[i]=15;
            else
                bon[i]=0;
        }
    }
}
