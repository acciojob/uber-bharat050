package com.driver.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table
public class Customer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    @ManyToOne
    @JoinColumn(name = "customerList")
    private Admin admin;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Customer(int customerId) {
        this.customerId = customerId;
    }
}