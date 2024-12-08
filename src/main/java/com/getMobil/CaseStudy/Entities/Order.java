package com.getMobil.CaseStudy.Entities;

// Sipariş

import java.util.Date;
import java.util.List;

public class Order {
    private List<OrderItem> items;
    private Date orderDate;

    public Order(List<OrderItem> items) {
        this.items = items;
        this.orderDate = new Date();
    }

    public double calculateTotalAmount() {
        return items.stream()
                .mapToDouble(OrderItem::calculateTotalPrice)
                .sum();
    }

}
// Getter ve Setter'lar yaz sonra..
