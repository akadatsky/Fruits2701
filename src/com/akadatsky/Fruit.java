package com.akadatsky;

public class Fruit {

    public enum FruitType {
        APPLE, LEMON, BANANA
    }

    public enum FruitColor {
        RED, YELLOW, GREEN
    }

    private FruitType type;
    private FruitColor color;
    private double pricePerKg;
    private int weight;

    public Fruit(FruitType type, FruitColor color, double pricePerKg, int weight) {
        this.type = type;
        this.color = color;
        this.pricePerKg = pricePerKg;
        this.weight = weight;
    }

    public FruitType getType() {
        return type;
    }

    public FruitColor getColor() {
        return color;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }
}
