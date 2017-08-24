package com.company;

public class Main {

    public static void main(String[] args) {
        FoodMarket foodMarket = new FoodMarket();
        foodMarket.createFruits();
        foodMarket.saveQuantityPurchased();
        foodMarket.calculateTotalBill();
        foodMarket.displayReceipt();
    }
}
