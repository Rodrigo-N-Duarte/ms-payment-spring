package com.example.payment.controller;

import com.example.payment.model.dto.payment.RequestPaymentDTO;
import com.example.payment.model.dto.payment.ResponsePaymentDTO;
import com.example.payment.service.CreditPaymentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
@RequiredArgsConstructor
public class PaymentController {
    private final ApplicationContext context;
    @PostMapping
    public ResponsePaymentDTO pay(@Valid @RequestBody RequestPaymentDTO payment) {
        return payment.getPaymentType().pay(context, payment);
    }
}
