package Repetytorium3;

/**
 *
 * @author matie_000
 */
public class QuickSortMSuchora implements ISort {
        public void quickSort(int lewy, int prawy,int[] tab) {
        int i, j, piwot, a;

        i = (lewy + prawy) / 2;
        piwot = tab[i];
        tab[i] = tab[prawy];
        for (j = i = lewy; i < prawy; i++) {
            if (tab[i] < piwot) {
                a = tab[i];
                tab[i] = tab[j];
                tab[j] = a;
                j++;
            }
        }
        tab[prawy] = tab[j];
        tab[j] = piwot;
        if (lewy < j - 1) {
            quickSort(lewy, j - 1, tab);
        }
        if (j + 1 < prawy) {
            quickSort(j + 1, prawy,tab);
        }
    }
    public void sort(int[] tab){
        int n=tab.length-1;
        for(int i=tab.length-1;i>=0;i--){
            if(tab[i]!=0){
                n=i;
                break;
          
            }
        }
        quickSort(0,n,tab);
    }
}
