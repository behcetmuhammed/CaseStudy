package com.getMobil.CaseStudy.Entities;

import java.util.Date;

public class Invoice {
    private String invoiceId;
    private double totalAmount;
    private Order order;
    private Date invoiceDate;

    public Invoice(String invoiceId, double totalAmount, Order order) {
        this.invoiceId = invoiceId;
        this.totalAmount = totalAmount;
        this.order = order;
        this.invoiceDate = new Date();
    }

    // Getter ve Setter'lar
}
