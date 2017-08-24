//Fruit class defines a fruit with its name and price.
package com.company;

public class Fruit {
    private String fruitName;
    private double pricePerKg;

    public Fruit(String fruitName, double pricePerKg) {
        this.fruitName = fruitName;
        this.pricePerKg = pricePerKg;
    }

    public String getFruitName() {
        return this.fruitName;
    }

    public double getPricePerKg() {
        return this.pricePerKg;
    }
}

