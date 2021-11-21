package Repetytorium3;

import java.util.Random;

/**
 *
 * @author matie_000
 */

public class Main {
    
    public static void timeCheck(ArrayManager am, ISort s){
          long start;
          long end;
          start= System.currentTimeMillis();
          am.sort();
          end= System.currentTimeMillis();
          System.out.println(end-start);
      }
    
    public static void main(String[] args) {
       ArrayManager Ja=new ArrayManager(100000);
       ArrayManager Michal=new ArrayManager(100000);
       ArrayManager Maja=new ArrayManager(100000);
       int[] tab =new int[10000];
       int liczba=0;
       Random rand =new Random();
       rand.nextInt();
       int left=0;
       int right=10000;
       for(int i=0;i<10000;i++)
       {
           liczba=(int)(left+rand.nextFloat()*(right-left));
           tab[i]=liczba;
       }     
       Ja.addAll(tab);
       Michal.addAll(tab);
       Maja.addAll(tab);
       
//       timeCheck(Ja,new QuickSortMSuchora());
//       timeCheck(Michal,new Bombelkowe_Michal());
////       timeCheck(Maja,QuickSortMaja());
//       
       
//       ar.sort(new QuickSortMSuchora());

   
    
      
      
       
       
   
    
    }
}   
