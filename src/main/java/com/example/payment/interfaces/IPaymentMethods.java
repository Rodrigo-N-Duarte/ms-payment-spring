package com.example.payment.interfaces;

import com.example.payment.model.dto.payment.RequestPaymentDTO;
import com.example.payment.model.dto.payment.ResponsePaymentDTO;

public interface IPaymentMethods {
    public ResponsePaymentDTO pay(RequestPaymentDTO payment);

}
