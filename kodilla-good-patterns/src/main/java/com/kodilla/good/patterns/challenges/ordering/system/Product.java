package com.kodilla.good.patterns.challenges.ordering.system;

public class Product {
    private String name;
    private double price;
    private String company;

    public Product(String name, double price, String company) {
        this.name = name;
        this.price = price;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }
}
