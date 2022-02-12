package com.kostina;

public class QuickSort {
    private int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
