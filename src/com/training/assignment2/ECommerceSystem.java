package com.training.assignment2;

import java.text.DecimalFormat;

public class ECommerceSystem {
    public static void main(String[] args) {
        ElectronicsProduct laptop = new ElectronicsProduct("Laptop", 899.99, "Dell");
        ClothingProduct tShirt = new ClothingProduct("T-Shirt", 19.99, "Large");

        // Display product information
        laptop.displayProductInfo();
        System.out.println("---------------------------");
        tShirt.displayProductInfo();
        System.out.println("---------------------------");

        // Calculate and display total prices
        int laptopQuantity = 2;
        int tShirtQuantity = 3;

        double laptopTotalPrice = laptop.calculateTotalPrice(laptopQuantity);
        double tShirtTotalPrice = tShirt.calculateTotalPrice(tShirtQuantity);

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Total Price for " + laptopQuantity + " laptops: $" + df.format(laptopTotalPrice));
        System.out.println("Total Price for " + tShirtQuantity + " t-shirts: $" + df.format(tShirtTotalPrice));
    }

}
