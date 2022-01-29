package com.akadatsky;

import java.util.ArrayList;
import java.util.List;

public class CashMachine {

    private List<Fruit> shoppingCart = new ArrayList<>();

    public void add(Fruit product) {
        shoppingCart.add(product);
    }

    //в задаче сказано округлить стоимость каждого фрукта, поэтому сделал в цикле, а не просто округлил итоговую сумму
    public void printBill() {
        double billSum = 0;
        for (Fruit item : shoppingCart) {
            billSum += Math.round((item.getWeight() * item.getPricePerKg() / 1000.0) * 100) / 100.0;
        }
        System.out.println("Загальна сума чеку: \u20B4" + billSum);
    }

}
