
package Bonifikata;

public class Bonifikata2 extends CompositeKlient{
    private int[] bon;
    
    public int getBon(int i) {
        return bon[i];
    }

    public boolean isDivBy3(double x){
        int i=0;
        double j=x%10;
        while(x>1){
            if(j%3==0){
                i++;
                x=(int) (x-x%10)/10;
                j=x%10;
            }
            else{
                x=(int) (x-x%10)/10;
            }
            
        }
        if(i>=6)
            return true;
        else
            return false;
    } 
    
    public Bonifikata2( Klient[] lista) {
        super(lista);
        this.bon=new int[super.getRozmiar()];
        for(int i=0; i<super.getRozmiar();i++ ){
            if(isDivBy3(super.getKlientPesel(i)))
                bon[i]=100;
            else
                bon[i]=0;
        }
    }
}
