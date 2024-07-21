package com.chayuna.customer.services;

import com.chayuna.customer.dtos.CustomerDTO;
import com.chayuna.customer.entities.Customer;

import java.util.List;

public interface CustomerService {

    List<CustomerDTO> getALlCustomers();
    CustomerDTO getCustomerById(Long id);
    CustomerDTO createCustomer(CustomerDTO customerDTO);
    CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO);
    void deleteCustomer(Long id);
}
