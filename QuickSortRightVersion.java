package com.kostina;

public class QuickSort  {
    private int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }

    public void sort(int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < array[low + (high - low) / 2]) {
                i++;
            }

            while (array[j] > array[low + (high - low) / 2]) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            sort(low, j);

        if (high > i)
            sort(i, high);
    }
}
