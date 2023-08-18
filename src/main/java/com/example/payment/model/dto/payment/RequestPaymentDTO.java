package com.example.payment.model.dto.payment;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public class RequestPaymentDTO {
    @Min(1)
    private Double value;
    @Min(1)
    private Integer payer;
    @Min(1)
    private Integer receiver;
}