package com.example.AddressBook.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class AddressBookModel {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private long phoneNumber;
    private String city;
    private String state;
    private long pincode;
    private String address;

}
