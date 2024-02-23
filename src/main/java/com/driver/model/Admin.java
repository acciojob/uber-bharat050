package com.driver.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.List;
@Entity
@Table
public class Admin{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;
    private String password;

    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
    private List<Customer> customerList;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    private List<Driver> driverList;

    public Admin(int adminId, String password) {
        this.adminId = adminId;
        this.password = password;
    }

    public Admin() {
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}