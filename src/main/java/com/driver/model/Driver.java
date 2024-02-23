package com.driver.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverId;
    private String number;
    private String password;

    @ManyToOne
    @JoinColumn(name = "driver")
    private Admin admin;

    public Driver(int driverId, String number, String password) {
        this.driverId = driverId;
        this.number = number;
        this.password = password;
    }

    public Driver() {
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}