package com.kodilla.good.patterns.challenges.Food2Door;

public class Main {

    public static void main(String[] args) {
        OrderData orderData1 = new OrderData("ExtraFoodShop", 123, "potatoes");
        OrderData orderData2 = new OrderData("GlutenFoodShop", 179, "potatoes");
        new FoodOrderProcess().processOrder(orderData1);
        new FoodOrderProcess().processOrder(orderData2);
    }
}



