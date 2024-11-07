package org.example;

import org.example.model.Product;

public class Snus implements Product {

    private int id;
    private String name;
    private double price;
    private boolean isNeeded;

    public Snus(int id, String name, double price, boolean isNeeded){
        this.id = id;
        this.name = name;
        this.price = price;
        this.isNeeded= isNeeded;
    }


    public void setNeeded(boolean needed) {
        isNeeded = needed;
    }

    public boolean isNeeded() {
        return isNeeded;
    }

    @Override
    public String examine() {
        return "Name: " + getProductName() + ", is needed: " + isNeeded();
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
