package com.getMobil.CaseStudy.Business;

// Sipariş Servisi
import com.getMobil.CaseStudy.Entities.Order;
import com.getMobil.CaseStudy.Entities.OrderItem;

import java.util.List;

public class OrderService {
    public Order createOrder(List<OrderItem> items) {
        // Ürünlerin mevcut olup olmadığını kontrol et
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("Sipariş boş olamaz.");
        }

        // Sipariş oluştur
        return new Order(items);
    }
}
