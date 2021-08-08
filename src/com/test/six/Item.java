package com.test.six;

public class Item {
    private String name;
    private int weight;
    private double cost;

    public Item(String name, int weight, double cost) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return name + ":  Вес - "+weight +"\n"+
                "Стоимость - "+ cost;
    }
}
