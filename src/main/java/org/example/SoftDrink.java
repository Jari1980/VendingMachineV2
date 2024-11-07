package org.example;

import org.example.model.Product;

public class SoftDrink implements Product {

    private int id;
    private String name;
    private double price;
    private boolean sugarFree;

    public SoftDrink(int id, String name, double price, boolean sugarFree){
        this.id = id;
        this.name = name;
        this.price = price;
        this.sugarFree = sugarFree;
    }

    public boolean isSugarFree() {
        return sugarFree;
    }

    public void setSugarFree(boolean sugarFree) {
        this.sugarFree = sugarFree;
    }

    @Override
    public String examine() {
        return "Name: " + name + ", sugarfree: " + sugarFree;
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
