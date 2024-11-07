package org.example;

import org.example.model.Currency;
import org.example.model.Product;
import org.example.model.VendingMachine;

public class CandyMachine implements VendingMachine {

    private int balance = 0;
    private Product[] products;

    public CandyMachine(){
        products = new Product[3];
        products[0] = new Greenie(1, "Broccoli", 10.0, "Good thing");
        products[1] = new Snus(2, "Kronan", 50, true);
        products[2] = new SoftDrink(3, "Milk", 10, false);
    }



    @Override
    public void addCurrency(Currency amount) {
        this.balance = this.balance + amount.getValue();
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public Product request(int id) {
        switch (id) {
            case (1):
                if (balance >= products[0].getPrice()) {
                    this.balance = this.balance - (int) products[0].getPrice();
                    System.out.println(products[0].use());
                    break;
                } else {
                    System.out.println("Not enough money for " + products[0].getProductName());
                    break;
                }
            case (2):
                if (balance >= products[1].getPrice()) {
                    this.balance = this.balance - (int) products[1].getPrice();
                    System.out.println(products[1].use());
                    break;
                } else {
                    System.out.println("Not enough money for " + products[1].getProductName());
                    break;
                }
            case (3):
                if (balance >= products[2].getPrice()) {
                    this.balance = this.balance - (int) products[2].getPrice();
                    System.out.println(products[2].use());
                    break;
                } else {
                    System.out.println("Not enough money for " + products[2].getProductName());
                    break;
                }
            default:
                System.out.println("Product not found.");
                break;
        }
        return null;
    }

    @Override
    public String getDescription(int id) {
        switch (id) {
            case (1):
                return products[0].examine();
            case (2):
                return products[1].examine();
            case (3):
                return products[2].examine();
            default:
                return "Product not found";
        }
    }

    @Override
    public String[] getProducts() {
        String[] prod = new String[3];
        prod[0] = products[0].examine();
        prod[1] = products[1].examine();
        prod[2] = products[2].examine();
        return prod;
    }

    public int endSession(){
        System.out.println("Here is your " + getBalance() + ", welcome back.");
        int bal = getBalance();
        this.balance = 0;
        return bal;
    }
}
