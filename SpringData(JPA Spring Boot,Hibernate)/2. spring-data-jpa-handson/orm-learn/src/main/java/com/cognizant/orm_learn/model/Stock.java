package com.cognizant.orm_learn.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "st_code")
    private String stCode;

    @Column(name = "st_date")
    private LocalDate stDate;

    @Column(name = "st_open")
    private double stOpen;

    @Column(name = "st_close")
    private double stClose;

    @Column(name = "st_volume")
    private long stVolume;

    // getters & setters
}