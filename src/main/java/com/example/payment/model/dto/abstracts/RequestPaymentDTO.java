package com.example.payment.model.dto.abstracts;

import com.example.payment.model.entity.User;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public class RequestPaymentDTO {
    @NotBlank
    LocalDateTime date;
    @NotBlank
    Double value;
    @NotBlank
    Integer payer;
    @NotBlank
    Integer receiver;
}
