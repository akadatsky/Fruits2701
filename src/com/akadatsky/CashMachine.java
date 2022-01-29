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
            double price = fruit.getWeight() * fruit.getPricePerKg() / 1000.0;
            double scale = Math.pow(10, 2);
            double roundedPrice = Math.round(price * scale) / scale;
            sum += roundedPrice;
        }

        System.out.println("Total price: " + sum);
    }

}
