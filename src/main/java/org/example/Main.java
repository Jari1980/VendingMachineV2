package org.example;

import org.example.model.Currency;

public class Main {
    public static void main(String[] args) {
        CandyMachine candyMachine = new CandyMachine();
        candyMachine.addCurrency(Currency.FIVE);
        String[] prods = candyMachine.getProducts();
        for(String element : prods){
            System.out.println(element);
        }
        System.out.println(candyMachine.getDescription(1));
        System.out.println(candyMachine.getBalance());
        candyMachine.request(1);
        candyMachine.addCurrency(Currency.FIVEHUNDRED);
        candyMachine.request(1);
        System.out.println(candyMachine.getBalance());
        candyMachine.request(3);
        candyMachine.endSession();
        System.out.println(candyMachine.getBalance());
    }
}