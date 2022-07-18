package com.example.AddressBook.dto;

import lombok.Data;

@Data
public class AddressBookDto {
    private String name;
    private long phoneNumber;
    private String address;
    private String city;
    private String state;
    private long pincode;
}
