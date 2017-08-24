package com.company;

import java.util.HashMap;
import java.util.Formatter;

public class FoodMarket {
    private Fruit[] fruits;
    double totalPrice;
    private HashMap<String, Double> fruitQuantityMap;

    public void createFruits() {
        fruits = new Fruit[4];
        fruits[0] = new Fruit("Apple", 100);
        fruits[1] = new Fruit("Orange", 80);
        fruits[2] = new Fruit("Banana", 30);
        fruits[3] = new Fruit("Kiwi", 120);
    }

    public void saveQuantityPurchased() {
        fruitQuantityMap = new HashMap<String, Double>();
        fruitQuantityMap.put("Apple", 2.0);
        fruitQuantityMap.put("Orange", 1.5);
        fruitQuantityMap.put("Banana", 0.5);
        fruitQuantityMap.put("Kiwi", 0.75);
    }

    public void calculateTotalBill() {
        totalPrice = 0;
        for (Fruit fruit : fruits) {
            totalPrice = totalPrice + fruit.getPricePerKg() * fruitQuantityMap.get(fruit.getFruitName());
        }
    }

    public void displayReceipt() {
        System.out.format("%-10s %5s %10s\n", "Total", "Quantity", "Amount");

        for (Fruit fruit : fruits) {
            double fruitWeight = fruitQuantityMap.get(fruit.getFruitName());
            System.out.format("%-10s %.2f %15.2f\n", fruit.getFruitName(), fruitWeight, fruitWeight * fruit.getPricePerKg());
        }
        System.out.println("\nTotal Amount = " + totalPrice);
    }
}


