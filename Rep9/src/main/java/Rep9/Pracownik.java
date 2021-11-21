
package Rep9;

import java.io.Serializable;

public class Pracownik implements Serializable{
    private String imie;
    private String nazwisko;
    private int wyplata;

    public Pracownik(String imie, String nazwisko, int wyplata ) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplata =wyplata;
    }
    
}
