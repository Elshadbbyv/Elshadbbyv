package javaCore.HackerRank.iktlab;

public class insertionSort {
    void selectArray(int[] array) {
        int a = array.length;
        for (int i = 1; i < a; i++) {
            int b = array[i];
            int k = i -1;
            while(k>=0 && array[k]>b){
                array[k+1]=array[k];
                k = k-1;


            }
            array[k+1]=b;



        }
    }

    public static void main(String[] args) {
        int[] array = {76,34,67,12,89,45,23};
        insertionSort sorting = new insertionSort();
        sorting.selectArray(array);
        int a = array.length;
        for (int i = 0; i < a; ++i) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
