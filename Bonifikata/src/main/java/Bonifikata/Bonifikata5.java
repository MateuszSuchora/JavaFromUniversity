
package Bonifikata;

import static java.lang.Math.abs;
import static java.lang.Math.pow;


public class Bonifikata5 extends CompositeKlient{
    
    private int[] bon;
    
    public int getBon(int i) {
        return bon[i];
    }

    public double ABS(double x){
        
        int a=0;
        int b=0;
        int i=1;
        double suma=0;
        while(i<12){
            a=(int) (x%pow(10,i)-x%pow(10,i-1));
            b=(int) (x%pow(10,i+1)-x%pow(10,i));
            suma=suma+abs(a-b);
            i++;
        }
        return suma;
    }
    
    public Bonifikata5( Klient[] lista) {
        super(lista);
        this.bon=new int[super.getRozmiar()];
        double suma=0;
        
        for(int i=0; i<super.getRozmiar();i++ ){
            if(ABS(super.getKlientPesel(i))>50 )
                bon[i]=200;
            else
                bon[i]=0;
        }
    }
    
}
