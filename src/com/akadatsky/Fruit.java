package com.galinachitakV.Fruits2701.src.com.akadatsky;

public class Fruit {

    public enum FruitType {
        APPLE, LEMON, BANANA
    }

    public enum Color {
        RED, YELLOW, GREEN
    }

    private FruitType type;
    private Color color;
    private double pricePerKg;
    private int weight;

    public Fruit(FruitType type, Color color, double pricePerKg, int weight) {
        this.type = type;
        this.color = color;
        this.pricePerKg = pricePerKg;
        this.weight = weight;
    }

    public FruitType getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }
}
