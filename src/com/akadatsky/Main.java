package com.akadatsky;

import java.util.Arrays;
import java.util.Random;

public class Main {
    /*1) Завершить задачу с фруктами что мы начали в классе ( https://github.com/akadatsky/Fruits2701 ):
    добавить все 4 фрукт
    округлить до сотых стоимость каждого фрукта (в методе printBill())
    2*)
   сделать форк репозитория https://github.com/akadatsky/Fruits270
   клонировать его себе из вашего форка
   завершить (задаче 1)
   сделать git push в свой форк
   послать pull реквест к моему оригинальному репозиторию*/

    /*
        Lemon: 24.90, 198г
        Banana: 31.30, 198г (again 198)
        RedApple: 14.90, 228г
        GreenApple: 23.90, 232г
     */
    public static void main(String[] args) {

        Fruit lemon = new Fruit(Fruit.FruitType.LEMON, Fruit.Color.YELLOW, 24.90, 198);
        Fruit banana = new Fruit(Fruit.FruitType.BANANA, Fruit.Color.YELLOW, 24.90, 190);
        Fruit RedApple = new Fruit(Fruit.FruitType.APPLE, Fruit.Color.RED, 14.90, 228);
        Fruit GreenApple = new Fruit(Fruit.FruitType.APPLE, Fruit.Color.GREEN, 24.90, 232);


        CashMachine cashMachine = new CashMachine();
        cashMachine.add(lemon);
        cashMachine.add(banana);
        cashMachine.add(RedApple);
        cashMachine.add(GreenApple);
        cashMachine.printBill();

        main1();

    }
    public static void main1() {
        /*Реализовать метод который сортирует массив целых чисел быстрой сортировкой.*/
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println("Было");
        System.out.println(Arrays.toString(arr));

        int left = 0;
        int right = arr.length - 1;

        quickSort(arr, left, right);
        System.out.println("Стало");
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] array, int left, int right) {
        if (array.length == 0){
            return;}

        if (left >= right){
            return;}

        int middle = left + (right - left) / 2;
        int count = array[middle];

        int i = left, j = right;
        while (i <= j) {
            while (array[i] < count) {
                i++;
            }

            while (array[j] > count) {
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

        if (left < j){
            quickSort(array, left, j);
        }

        if (right > i){
            quickSort(array, i, right);
        }
    }

}




