
package Bonifikata;

import java.util.ArrayList;
import java.util.List;

public class CompositeKlient implements Component{
   private Klient lista[];
   private int rozmiar;

    public void addKlient(Klient com){
        lista[rozmiar]=com;
        rozmiar++;
    } 
    
    public double getKlientPesel(int i){
        return lista[i].getPesel();
    }
    public double getDochody(int i){
          return lista[i].getDochody();
    }
    
    public int getRozmiar() {
        return rozmiar;
    }
   
   @Override
    public void dane(){
        for( int i=0; i<rozmiar;i++){
            lista[i].toString();
        }
    }

    public CompositeKlient(Klient[] lista) {
        this.lista = lista;
        rozmiar=lista.length;
    }

    
    
    public CompositeKlient(Klient klient) {
        lista[0] = klient;
        rozmiar=1;
    }
    public CompositeKlient() {
        rozmiar=0;
    }
}
