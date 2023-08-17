package com.example.payment.model.entity;

import com.example.payment.model.abstracts.Payment;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_payment_cash")
public class CashPayment  extends Payment {

}
