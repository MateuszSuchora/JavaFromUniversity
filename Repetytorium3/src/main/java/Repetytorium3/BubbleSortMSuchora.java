package Repetytorium3;

/**
 *
 * @author matie_000
 */
public class BubbleSortMSuchora implements ISort {
    public void sort(int[] tab){
        int n=tab.length;
        for(int i=tab.length-1;i>=0;i--){
            if(tab[i]!=0){
                n=i;
                break;
            }
        }
         for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    // swap arr[j+1] and arr[i] 
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
    }
}
