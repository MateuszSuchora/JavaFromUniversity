
package Bonifikata;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class BonifikataVip extends CompositeKlient{
    private int[] bon;
    
    public int getBon(int i) {
        return bon[i];
    }

   
    
    public BonifikataVip( Klient[] lista) {
        super(lista);
        this.bon=new int[super.getRozmiar()];
        
        for(int i=0; i<super.getRozmiar();i++ ){
            if(super.getDochody(i)>100000)
                bon[i]=30;
            else
                bon[i]=0;
        }
    }
}
