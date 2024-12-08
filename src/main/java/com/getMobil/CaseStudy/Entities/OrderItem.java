package com.getMobil.CaseStudy.Entities;


// Sipariş Öğesi
public class OrderItem {
    private Product product;
    private int quantity;

    // Constructor, Getter ve Setter'lar
    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        return product.calculateFinalPrice() * quantity;
    }
}
