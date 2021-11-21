
package Bonifikata;

public class Bonifikata1 extends CompositeKlient{
    private int[] bon;

    public int getBon(int i) {
        return bon[i];
    }

    
    public boolean isOdd(double x){
        while(x>1){
            if(x%2==0)
                return false;
            else{
                x=(int)(x-x%10)/10;
            }
            
        }
        return true;
    } 
    
    public Bonifikata1( Klient[] lista) {
        super(lista);
        this.bon=new int[super.getRozmiar()];
        for(int i=0; i<super.getRozmiar();i++ ){
            if(isOdd(super.getKlientPesel(i)))
                bon[i]=50;
            else
                bon[i]=0;
        }
    }

    
}
