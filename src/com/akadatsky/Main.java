package com.akadatsky;

public class Main {

    /*
        Lemon: 24.90, 198г
        Banana: 31.30, 198г (again 198)
        RedApple: 14.90, 228г
        GreenApple: 23.90, 232г
     */
    public static void main(String[] args) {

        Fruit lemon = new Fruit(Fruit.FruitType.LEMON, Fruit.Color.YELLOW, 24.90, 198);
        Fruit banana = new Fruit(Fruit.FruitType.LEMON, Fruit.Color.YELLOW, 31.30, 198);
        Fruit redApple = new Fruit(Fruit.FruitType.APPLE, Fruit.Color.RED, 14.90, 228);
        Fruit greenApple = new Fruit(Fruit.FruitType.APPLE, Fruit.Color.GREEN, 23.90, 232);
        CashMachine cashRegister = new CashMachine();
        cashRegister.add(redApple);
        cashRegister.add(greenApple);
        cashRegister.add(lemon);
        cashRegister.add(banana);
        cashRegister.printBill();

    }
}
