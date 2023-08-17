package com.example.payment.interfaces;

import com.example.payment.model.abstracts.Payment;
import com.example.payment.model.dto.abstracts.RequestPaymentDTO;
import com.example.payment.model.dto.abstracts.ResponsePaymentDTO;

public interface IPaymentMethods {
    public ResponsePaymentDTO pay(RequestPaymentDTO payment);

}
