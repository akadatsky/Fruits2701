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
            sum += fruit.getWeight() * fruit.getPricePerKg() / 1000.0;
        }
        String result = String.format("%.2f", sum);
        System.out.println("Total price: " + result);
    }

}
