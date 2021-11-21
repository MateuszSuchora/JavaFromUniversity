package kino;

import java.util.Comparator;


public class ExampleComparator implements Comparator<Produkt> {
    public int compare(Produkt obj1, Produkt obj2){
        if(obj1==null &&obj2==null)
            return 0;
        if(obj1==null)
            return -1;
        if(obj2==null)
            return 1;
        if((obj1.getPrice() - obj2.getPrice())>0){
            return 1;
        }
        else if((obj1.getPrice() - obj2.getPrice())<0) {
            return -1;
        }
        else{
            return 0;
        }
        
    }
}
