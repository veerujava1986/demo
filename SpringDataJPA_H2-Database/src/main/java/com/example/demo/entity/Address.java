package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    private int addressId;
    private String addressLine1;
    private String city;
    private String state;
    private String country;
    private int pincode;

    @OneToOne(targetEntity=Employee.class)
    private Employee employee;


}