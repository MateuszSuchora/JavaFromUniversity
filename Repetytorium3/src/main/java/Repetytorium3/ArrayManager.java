package Repetytorium3;

import java.util.Arrays;

public class ArrayManager {

    private int min;
    private int max;
    private int[] tab;
    private int nElems;//ilosc elementow w tablicy

    public ArrayManager(int size) {
        tab = new int[size];
        nElems = 0;
        min = 0;
        max = 0;
    }

    public void insert(int element) {
        if (nElems < tab.length) {
            tab[nElems] = element;
            nElems = nElems + 1;
        } else {
            System.out.println("Brak miejsca w tablicy, dodawanie sie nie powiodlo");
        }

    }

    public void addAll(int[] tab) {
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
        tab[nElems] = 0;
        nElems = nElems - 1;
    }

    @Override
    public String toString() {
        return Arrays.toString(tab);
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }
    public void sort(SortType type){
        if(type==SortType.QUICK_SORT){
            quickSort(0,nElems);
        }
    }
    public void sort(ISort type){
        type.sort(tab);
    }

    void sort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum SortType{
        BUBBLE_SORT,
        QUICK_SORT,
        SELECRION_SORT,
    }
    public void bubbleSort() {
        for (int i = 0; i < nElems - 1; i++) {
            for (int j = 0; j < nElems - i - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    // swap arr[j+1] and arr[i] 
                    int temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
    }

    public void quickSort(int lewy, int prawy) {
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
            quickSort(lewy, j - 1);
        }
        if (j + 1 < prawy) {
            quickSort(j + 1, prawy);
        }
    }

    public void SelectionSort(){
        int pmin, a;
        for (int j = 0; j < nElems - 1; j++) {
            pmin = j;
            for (int i = j + 1; i < nElems; i++) {
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
