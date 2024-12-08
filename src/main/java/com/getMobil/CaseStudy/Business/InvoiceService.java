package com.getMobil.CaseStudy.Business;

// Fatura Servisi
import com.getMobil.CaseStudy.Entities.Invoice;
import com.getMobil.CaseStudy.Entities.Order;

import java.util.UUID;

public class InvoiceService {
    public Invoice generateInvoice(Order order) {
        if (order == null) {
            throw new IllegalArgumentException("Sipariş boş olamaz.");
        }

        // Fatura oluştur
        return new Invoice(UUID.randomUUID().toString(), order.calculateTotalAmount(), order);
    }
}
