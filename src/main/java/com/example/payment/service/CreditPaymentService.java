package com.example.payment.service;

import com.example.payment.interfaces.IPaymentMethods;
import com.example.payment.model.dto.payment.RequestPaymentDTO;
import com.example.payment.model.dto.payment.ResponsePaymentDTO;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class CreditPaymentService {
    private final ModelMapper mapper;
    public ResponsePaymentDTO pay(RequestPaymentDTO payment) {
        return mapper.map(payment, ResponsePaymentDTO.class);
    }
}
