package com.mamonov.lesson10.QuickSort;
//Task 3. QuickSort method
        /*3*) Реализовать метод который сортирует массив целых чисел быстрой сортировкой.*/

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {49, 29, 82, 43, 37, 17, 6, 2, 38, 96, 5, 64, 30, 34, 7};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * quickSort method
     * @param arr is an orignal array that needs to be sorted
     * @param left (mandatory argument) is the first index of array range
     * @param right (mandatory argument) is the last index of array range
     */
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int divideIndex = partition(arr, left, right);
            quickSort(arr, left, divideIndex - 1);
            quickSort(arr, divideIndex, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int rightIndex = right;
        int leftIndex = left;

        int pivot = arr[left + (right - left) / 2];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
