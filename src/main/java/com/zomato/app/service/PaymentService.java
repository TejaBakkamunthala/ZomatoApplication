package com.zomato.app.service;

import java.util.List;

import com.zomato.app.Entity.Payment;

public interface PaymentService {
    List<Payment> getAllPayments();
    Payment getPaymentById(int paymentId);
    Payment createPayment(Payment payment);
    Payment updatePayment(Payment payment);
    void deletePayment(int paymentId);
}
