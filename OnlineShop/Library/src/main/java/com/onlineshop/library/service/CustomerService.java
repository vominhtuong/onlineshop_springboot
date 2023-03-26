package com.onlineshop.library.service;

import com.onlineshop.library.dto.CustomerDto;
import com.onlineshop.library.model.Customer;

public interface CustomerService {

    CustomerDto save(CustomerDto customerDto);

    Customer findByUsername(String username);

    Customer saveInfor(Customer customer);
}
