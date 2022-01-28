package com.akadatsky;
//Task 1. Finish the Fruit shopping program
        /*1) Завершить задачу с фруктами что мы начали в классе ( https://github.com/akadatsky/Fruits2701 ):
        добавить все 4 фрукта
        округлить до сотых стоимость каждого фрукта (в методе printBill())*/

public class Main {

    /*
        Lemon: 24.90, 198г
        Banana: 31.30, 198г (again 198)
        RedApple: 14.90, 228г
        GreenApple: 23.90, 232г
     */
    public static void main(String[] args) {

        Fruit lemon = new Fruit(Fruit.FruitType.LEMON, Fruit.FruitColor.YELLOW, 24.90, 198);
        Fruit banana = new Fruit(Fruit.FruitType.BANANA, Fruit.FruitColor.YELLOW, 31.30, 190);
        Fruit redApple = new Fruit(Fruit.FruitType.APPLE, Fruit.FruitColor.RED, 14.90, 228);
        Fruit greenApple = new Fruit(Fruit.FruitType.APPLE, Fruit.FruitColor.GREEN, 23.90, 232);

        CashMachine cashMachine = new CashMachine();
        cashMachine.add(lemon);
        cashMachine.add(banana);
        cashMachine.add(redApple);
        cashMachine.add(greenApple);
        cashMachine.printBill();
    }
}
