
package Bonifikata;

import static java.lang.Math.pow;

public class Bonifikata4 extends CompositeKlient{
    private int[] bon;
    
    public int getBon(int i) {
        return bon[i];
    }

    
    public Bonifikata4( Klient[] lista) {
        super(lista);
        double suma=0;
        this.bon=new int[super.getRozmiar()];
        
        for(int i=0; i<super.getRozmiar();i++ ){
            suma=0;
            double x=super.getKlientPesel(i);
            double dzien=x%10000000-x%100000;
            double miesiac=x%1000000000-x%10000000;
            for(int j=1;j<12;j++){
                suma=suma+(x%(pow(10,j))-x%(pow(10,j-1)));
        }
            if((dzien+miesiac)*3==suma )
                bon[i]=550;
            else
                bon[i]=0;
        }
    }
}
