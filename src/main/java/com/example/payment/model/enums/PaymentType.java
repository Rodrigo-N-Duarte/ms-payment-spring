package com.example.payment.model.enums;

import com.example.payment.model.dto.payment.RequestPaymentDTO;
import com.example.payment.model.dto.payment.ResponsePaymentDTO;
import com.example.payment.service.CashPaymentService;
import com.example.payment.service.CreditPaymentService;
import com.example.payment.service.DebitPaymentService;
import com.example.payment.service.PixPaymentService;
import org.modelmapper.ModelMapper;
import org.springframework.context.ApplicationContext;

public enum PaymentType {
    CREDIT_CARD {
        @Override
        public ResponsePaymentDTO pay(ApplicationContext context, RequestPaymentDTO payment) {
            CreditPaymentService cashPayment = context.getBean(CreditPaymentService.class);
            return cashPayment.pay(payment);
        }
    },
    PIX {
        @Override
        public ResponsePaymentDTO pay(ApplicationContext context, RequestPaymentDTO payment) {
            PixPaymentService cashPayment = context.getBean(PixPaymentService.class);
            return cashPayment.pay(payment);
        }
    },
    CASH {
        @Override
        public ResponsePaymentDTO pay(ApplicationContext context, RequestPaymentDTO payment) {
            CashPaymentService cashPayment = context.getBean(CashPaymentService.class);
            return cashPayment.pay(payment);
        }
    },
    DEBIT_CARD {
        @Override
        public ResponsePaymentDTO pay(ApplicationContext context, RequestPaymentDTO payment) {
            DebitPaymentService cashPayment = context.getBean(DebitPaymentService.class);
            return cashPayment.pay(payment);
        }
    };
    public ResponsePaymentDTO pay(ApplicationContext context, RequestPaymentDTO payment) {
        var modelMapper = new ModelMapper();
        return modelMapper.map(payment, ResponsePaymentDTO.class);
    }
}
