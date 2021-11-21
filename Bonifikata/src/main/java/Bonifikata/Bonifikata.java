
package Bonifikata;

public class Bonifikata {
    int []bonifikata;
    private Bonifikata1 b1;
    private Bonifikata2 b2;
    private Bonifikata3 b3;
    private Bonifikata4 b4;
    private Bonifikata5 b5;
    private BonifikataVip bV;

    public Bonifikata( Bonifikata1 b1, Bonifikata2 b2, Bonifikata3 b3, Bonifikata4 b4, Bonifikata5 b5, BonifikataVip bV) {
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
        this.b5 = b5;
        this.bV = bV;
        this.bonifikata=new int[b1.getRozmiar()];
        for(int i=0;i<b1.getRozmiar();i++){
            bonifikata[i]=b1.getBon(i)+b2.getBon(i)+b3.getBon(i)+b4.getBon(i)+b5.getBon(i)+bV.getBon(i); 
    
        }
    }

    @Override
    public String toString() {
        String str="";
        int a=1;
        for(int i=0;i<bonifikata.length;i++){
            str=str+"Bonifikata osoby "+a+":"+bonifikata[i]+"\n";
            a++;
        }
        return str;
    }
    
    
    
    
}
