/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 *
 * @author wlasciciel
 */
public class Lambda02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Elem> list1 = new ArrayList<>();
        
        list1.add(new Elem("Polska",38));
        list1.add(new Elem("Niemcy",86));
        list1.add(new Elem("Austria",20));
        
       List<String> list2 = new ArrayList<>();
        list2.add("Polska");
        list2.add("Niemcy");
        list2.add("Austria");
//        
//        list2.forEach((e)->{System.out.println(e);});
//        
        Collections.sort(list2,(e1,e2)-> -e2.compareTo(e1));        
        list2.forEach((e)->{System.out.println(e);});
             
          Collections.sort(list1,(e1,e2)-> e2.getName().compareTo(e1.getName()));  
          list1.forEach((e)->{System.out.println(e.getName()+" "+e.getAge());});
          
          Function<Double,Double> fun = Math::sin;
          System.out.println(fun.apply(1.57));
          
          Supplier<Punkt> create = Punkt::new;
          
          Punkt p = create.get();
          
          System.out.println(p.x);
          
          Consumer<String> strcons = System.out::println;
          strcons.accept("Kot");
          
          
    }
    
}
