package com.getMobil.CaseStudy.Entities;

// Ürün sınıfı
public class Product {
    private String name;
    private double price;
    private double taxRate; // Vergi oranı
    private double discount; // İndirim oranı

    // Constructor, Getter ve Setter'lar
    public Product(String name, double price, double taxRate, double discount) {
        this.name = name;
        this.price = price;
        this.taxRate = taxRate;
        this.discount = discount;
    }

    public double calculateFinalPrice() {
        return price + (price * taxRate) - discount;
    }
}

