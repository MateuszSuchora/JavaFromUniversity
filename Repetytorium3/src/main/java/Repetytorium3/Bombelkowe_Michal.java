/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repetytorium3;

/**
 *
 * @author skung
 */
public class Bombelkowe_Michal implements ISort {

    @Override
    public void sort(int[] tab) {
               
        bubleSort(tab);
         
    
    }
    
    

    public void bubleSort(int[] tab) {
        
      
         int temp;
       // System.out.println();
        for (int i = 0; i < tab.length - 1; i++){       
           for (int j = 0; j < tab.length - 1; j++){
                if(tab[j] > tab[j + 1]){
                    temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                    }
                }
          }                 
       // System.out.println();
       // System.out.println("Posortowana tablica: ");        
        //for(int i = 0; i < tab.length; i++) System.out.print(tab[i] + " ");
         
    
    }
   
}
