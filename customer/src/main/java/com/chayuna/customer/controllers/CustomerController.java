package com.chayuna.customer.controllers;


import com.chayuna.customer.dtos.CustomerDTO;
import com.chayuna.customer.services.CustomerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerServiceImpl customerServiceImpl;

    public CustomerController(CustomerServiceImpl customerServiceImpl) {
        this.customerServiceImpl = customerServiceImpl;
    }

    @GetMapping
    public List<CustomerDTO> getAllCustomers
}
