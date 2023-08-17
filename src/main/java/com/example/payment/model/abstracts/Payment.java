package com.example.payment.model.abstracts;

import com.example.payment.model.entity.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(columnDefinition = "TIMESTAMP")
    LocalDateTime date;
    @Column
    Double value;
    @ManyToOne
    User payer;
    @ManyToOne
    User receiver;
}
