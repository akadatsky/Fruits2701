package com.akadatsky;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CashMachine {

    private List<Fruit> fruits = new ArrayList<>();

    public void add(Fruit fruit) {
        fruits.add(fruit);
    }

    public void printBill() {
        double sum = 0;
        DecimalFormat df = new DecimalFormat("#.##");
        for (Fruit fruit : fruits) {
            sum += fruit.getWeight() * fruit.getPricePerKg() / 1000.0;
        }
        System.out.println("Total: " + df.format(sum));
    }

}
