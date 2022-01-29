package com.akadatsky;

import java.util.ArrayList;
import java.util.List;

public class CashMachine {

    private List<Fruit> fruits = new ArrayList<>();

    public void add(Fruit fruit) {
        fruits.add(fruit);
    }

    public void printBill() {
        double sum = 0;
        double fruitprice;
        for (Fruit fruit : fruits) {
            fruitprice = Math.round(fruit.getWeight() * fruit.getPricePerKg() / 1000.0 * 100) / 100d;
            sum += fruitprice;
            System.out.printf("%-8s%8.2f%n", fruit.getType(), fruitprice);
        }
        System.out.println("Total sum:  " + sum);
    }
}

