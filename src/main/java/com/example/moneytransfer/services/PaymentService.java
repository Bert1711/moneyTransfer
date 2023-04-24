package com.example.moneytransfer.services;

import com.example.moneytransfer.exceptions.NotEnoughMoneyException;
import com.example.moneytransfer.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}