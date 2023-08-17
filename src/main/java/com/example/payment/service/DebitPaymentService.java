package com.example.payment.service;

import com.example.payment.interfaces.IPaymentMethods;
import com.example.payment.model.abstracts.Payment;
import com.example.payment.model.dto.abstracts.RequestPaymentDTO;
import com.example.payment.model.dto.abstracts.ResponsePaymentDTO;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class DebitPaymentService implements IPaymentMethods {
    private final ModelMapper mapper;
    @Override
    public ResponsePaymentDTO pay(RequestPaymentDTO payment) {
        return mapper.map(payment, ResponsePaymentDTO.class);
    }

}
