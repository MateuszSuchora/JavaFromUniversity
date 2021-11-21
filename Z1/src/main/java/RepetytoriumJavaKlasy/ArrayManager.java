package RepetytoriumJavaKlasy;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayManager<E> {

    private E[] tab;
    private int nElems;//ilosc elementow w tablicy

    public E get(int i) {
        return tab[i];
    }

    public ArrayManager(int size) {
        tab = (E[]) new Object[size];
        nElems = 0;

    }

    public void insert(E element) {
        if (nElems < tab.length) {
            tab[nElems] = element;
            nElems = nElems + 1;
        } else {
            System.out.println("Brak miejsca w tablicy, dodawanie sie nie powiodlo");
        }

    }

    public void addAll(E[] tab) {
        int n = tab.length;
        int len = this.tab.length;
        if (n + nElems < len) {
            for (int i = 0; i < n; i++) {
                insert(tab[i]);
            }
        } else {
            System.out.println("Brak miejscaw tablicy, dodawanie sie nie powiodlo");
        }
    }

    public void delete(int index) {
        for (int i = index; i < nElems; i++) {
            tab[i] = tab[i + 1];
        }
        tab[nElems] = null;
        nElems = nElems - 1;
    }

    private void ensureCapa() {
        int newSize = tab.length * 2;
        tab = Arrays.copyOf(tab, newSize);
    }

    @Override
    public String toString() {
        return Arrays.toString(tab);
    }

    public void bubblesort(Comparator<E> compar) {
        for (int i = 0; i < nElems - 1; i++) {
            for (int j = 0; j < nElems - i - 1; j++) {
                if (compar.compare(tab[j], tab[j + 1]) > 0) {
                    E temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
    }

}
