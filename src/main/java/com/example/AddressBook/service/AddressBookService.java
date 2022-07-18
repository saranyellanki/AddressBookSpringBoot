package com.example.AddressBook.service;

import com.example.AddressBook.dto.AddressBookDto;
import com.example.AddressBook.model.AddressBookModel;
import com.example.AddressBook.repo.IAddressBook;
import com.example.AddressBook.response.Response;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class AddressBookService {

    @Autowired
    IAddressBook iAddressBook;

    @Autowired
    ModelMapper modelMapper;

    public Response saveAddress(AddressBookDto addressBookDto) {
        AddressBookModel address = modelMapper.map(addressBookDto,AddressBookModel.class);
        iAddressBook.save(address);
        return new Response(HttpStatus.OK,address,"Address saved successfully");
    }
}
