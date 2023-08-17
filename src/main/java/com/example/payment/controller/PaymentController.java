package com.example.payment.controller;

import com.example.payment.model.dto.abstracts.RequestPaymentDTO;
import com.example.payment.model.dto.abstracts.ResponsePaymentDTO;
import com.example.payment.service.CreditPaymentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
@RequiredArgsConstructor
public class PaymentController {
    private final CreditPaymentService paymentService;
    @PostMapping
    public ResponsePaymentDTO pay(@Valid @RequestBody() RequestPaymentDTO payment) {
        return paymentService.pay(payment);
    }
}
