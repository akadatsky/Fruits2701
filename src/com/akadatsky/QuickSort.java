package com.akadatsky;

public class QuickSort {

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int part = partition(array, start, end);
            quickSort(array, start, part - 1);
            quickSort(array, part + 1, end);

        }
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int index = start - 1;

        for (int i = start; i < end; i++) {
            if (array[i] <= pivot) {
                index++;
                int tmp = array[index];
                array[index] = array[i];
                array[i] = tmp;
            }
        }

        int tmp = array[index + 1];
        array[index + 1] = array[end];
        array[end] = tmp;

        return index + 1;
    }

}
