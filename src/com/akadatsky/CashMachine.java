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
        for (Fruit fruit : fruits) {
            sum += Math.round(fruit.getWeight() * fruit.getPricePerKg() / 10.0) / 100.0;
        }
        System.out.println("Total: " + sum);
    }
}