package com.example.payment.model.entity;

import com.example.payment.model.abstracts.Payment;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "tb_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String jwt;
    @Column
    private String name;
    @Column
    private String password;
    @Column
    private String email;
    @OneToMany(mappedBy = "receiver")
    private Set<Payment> receivedPayments;
    @OneToMany(mappedBy = "payer")
    private Set<Payment> toPay;
}
