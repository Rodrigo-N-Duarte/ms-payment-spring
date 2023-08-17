package com.example.payment.model.entity;

import com.example.payment.model.abstracts.Payment;
import com.example.payment.model.enums.TypeCardPayment;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_payment_debit")
public class DebitCardPayment  extends Payment {
    @Column
    private TypeCardPayment typeCard;
}
