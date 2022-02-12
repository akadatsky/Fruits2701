package com.akadatsky;

public class Fruit {

    public enum FruitType {
        APPLE, LEMON, BANANA
    }

    private FruitType type;
    private double price;
    private int weight;

    public Fruit(FruitType type, double price, int weight) {
        this.type = type;
        this.price = price;
        this.weight = weight;
    }

    public FruitType getType() {
        return type;
    }

    public double getPricePerKg() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        double cost = weight * price / 1000 * 100;
        cost = (int) cost;
        return "\n" + price + " x " +
                weight + "\n" +
                type + ": " +
                cost / 100 + " грн.";
    }
}