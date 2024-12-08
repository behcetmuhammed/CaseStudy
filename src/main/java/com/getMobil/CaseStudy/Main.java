package com.getMobil.CaseStudy;

import com.getMobil.CaseStudy.Business.InvoiceService;
import com.getMobil.CaseStudy.Business.OrderService;
import com.getMobil.CaseStudy.Entities.Invoice;
import com.getMobil.CaseStudy.Entities.Order;
import com.getMobil.CaseStudy.Entities.OrderItem;
import com.getMobil.CaseStudy.Entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Case Study Getmobil");

        // Örnek ürünler
        Product product1 = new Product("Laptop", 1500.00, 0.18, 100.00);
        Product product2 = new Product("Mouse", 50.00, 0.08, 5.00);

        // Sipariş öğeleri
        OrderItem item1 = new OrderItem(product1, 1);
        OrderItem item2 = new OrderItem(product2, 2);

        List<OrderItem> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        // Sipariş oluştur
        OrderService orderService = new OrderService();
        Order order = orderService.createOrder(items);

        // Fatura oluştur
        InvoiceService invoiceService = new InvoiceService();
        Invoice invoice = invoiceService.generateInvoice(order);

        // Çıktılar
        System.out.println("Toplam Sipariş Tutarı: " + order.calculateTotalAmount());
        System.out.println("Fatura ID: " + invoice.getInvoiceId());
        System.out.println("Fatura Tarihi: " + invoice.getInvoiceDate());
    }
}