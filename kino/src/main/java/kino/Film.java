
package kino;

public class Film {
    private int kodFilmu;
    private int max;
    private int iloscZajetychMiejsc;
    private ArrayManager<Osoba> miejsca;

    public int getKodFilmu() {
        return kodFilmu;
    }

    public Film(int kodFilmu, int max) {
        this.kodFilmu = kodFilmu;
        this.max = max;
        miejsca = new ArrayManager(max);
        iloscZajetychMiejsc=0;    
    }

    @Override
    public String toString() {
        String x;
        x="KodFilmu:" + kodFilmu + ", Miejsca:" + miejsca.toString();
        
        for(int i=max-iloscZajetychMiejsc;max<=i;i++){
            x=x+"[wolne]";
        }
        return x;
    }
    public void addOsoba(Osoba osoba) throws BrakWolnychMiejscException{
        if(iloscZajetychMiejsc==max)
            throw  new  BrakWolnychMiejscException(this,"Brak wolnych miejsc");
        else{
            miejsca.insert(osoba);
            iloscZajetychMiejsc++;
            
        }
    }
    
    
}
