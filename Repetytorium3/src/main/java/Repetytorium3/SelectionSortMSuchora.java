
package Repetytorium3;

/**
 *
 * @author matie_000
 */
public class SelectionSortMSuchora implements ISort{
    public void sort(int[] tab) {

        int pmin, a;
        int n = tab.length;
        for (int i = tab.length-1; i >= 0; i--) {
            if (tab[i] != 0) {
                n = i;
                break;
            }
        }
        for (int j = 0; j < n - 1; j++) {
            pmin = j;
            for (int i = j + 1; i < n; i++) {
                if (tab[i] < tab[pmin]) {
                    pmin = i;
                }
            }
            a = tab[pmin];
            tab[pmin] = tab[j];
            tab[j] = a;
        }
    }
}
