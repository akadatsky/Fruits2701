package com.akadatsky;

public class Main {
    public static void main(String[] args) {

        Fruit lemon = new Fruit(Fruit.FruitType.LEMON, 24.90, 198);
        Fruit banana = new Fruit(Fruit.FruitType.BANANA, 30.89, 200);
        Fruit apple = new Fruit(Fruit.FruitType.APPLE, 14.09, 300);

        CashMachine cashMachine = new CashMachine();
        cashMachine.add(lemon);
        cashMachine.add(banana);
        cashMachine.add(apple);
        cashMachine.printBill();
    }
}