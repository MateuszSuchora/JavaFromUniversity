package Repetytorium3;

public class QuickSortMaja implements ISort{

    private void quickSort(int [] tab, int low, int high){
        if (low < high)
        {

            int pi = partition(tab, low, high);

            quickSort(tab, low, pi-1);
            quickSort(tab, pi+1, high);
        }

    }

    private int partition(int [] tab, int low, int high)
    {
        int pivot = tab[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (tab[j] < pivot)
            {
                i++;
                int temp = tab[i];
                tab[i] = tab[j];
                tab[j] = temp;
            }
        }

        int temp = tab[i+1];
        tab[i+1] = tab[high];
        tab[high] = temp;

        return i+1;
    }

    @Override
    public void sort(int [] tab){
        quickSort(tab, 0, tab.length-1);
    }


}
