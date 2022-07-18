package com.example.AddressBook.response;

import com.example.AddressBook.model.AddressBookModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class Response {
    private HttpStatus code;
    private AddressBookModel data;
    private String message;
}
