package com.akadatsky;

import java.util.Arrays;
import java.util.Random;

public class HomeWork10Task3 {
     /*
     3*) Реализовать метод который сортирует массив целых чисел быстрой сортировкой.
     */
    public static void main(String[] args) {
        int[] arrayToSort = new int[15];
        Random random = new Random();

        for (int i = 0; i < arrayToSort.length; i++) {
            arrayToSort[i] = random.nextInt(50);

        }

        System.out.println("Origin array: " + Arrays.toString(arrayToSort));
        QuickSort.quickSort(arrayToSort, 0, arrayToSort.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arrayToSort));
    }
}
