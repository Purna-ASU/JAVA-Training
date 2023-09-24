package com.training.assignment2;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double calculateTotalPrice(int quantity) {
        return price * quantity;
    }

    public void displayProductInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }
}

class ElectronicsProduct extends Product {
    private String brand;

    public ElectronicsProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Brand: " + brand);
    }
}

class ClothingProduct extends Product {
    private String size;

    public ClothingProduct(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Size: " + size);
    }
}


