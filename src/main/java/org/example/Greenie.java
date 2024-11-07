package org.example;

import org.example.model.Product;

public class Greenie implements Product {

    private int id;
    private String name;
    private double price;
    private String description;

    public Greenie(int id, String name, double price, String description){
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String examine() {
        return "Name: " + name + ", description: " + description;
    }

    @Override
    public String use() {
        return "Enjoy your " + name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getProductName() {
        return name;
    }

    @Override
    public void setProductName(String productName) {
        this.name = productName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
