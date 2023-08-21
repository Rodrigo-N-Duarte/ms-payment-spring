package com.example.payment.model.dto.payment;

import com.example.payment.model.enums.PaymentType;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
public class ResponsePaymentDTO {
    private Double value;
    private Integer payer;
    private Integer receiver;
    private PaymentType paymentType;
}
