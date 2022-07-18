package com.example.AddressBook.repo;

import com.example.AddressBook.model.AddressBookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressBook extends JpaRepository<AddressBookModel,Long> {
}
