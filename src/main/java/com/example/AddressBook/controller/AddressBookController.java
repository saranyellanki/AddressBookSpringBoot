package com.example.AddressBook.controller;

import com.example.AddressBook.dto.AddressBookDto;
import com.example.AddressBook.response.Response;
import com.example.AddressBook.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressBookController {

    @Autowired
    AddressBookService addressBookService;

    @PostMapping("/addressBook")
    public ResponseEntity<Response> saveAddress(@RequestBody AddressBookDto addressBookDto){
        Response res = addressBookService.saveAddress(addressBookDto);
        return new ResponseEntity<>(res,res.getCode());
    }
}
