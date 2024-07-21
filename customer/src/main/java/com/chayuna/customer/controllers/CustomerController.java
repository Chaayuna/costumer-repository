package com.chayuna.customer.controllers;


import com.chayuna.customer.dtos.CustomerDTO;
import com.chayuna.customer.services.CustomerServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerServiceImpl customerServiceImpl;

    public CustomerController(CustomerServiceImpl customerServiceImpl) {
        this.customerServiceImpl = customerServiceImpl;
    }

    @GetMapping
    public List<CustomerDTO> getAllCustomers(){
         return customerServiceImpl.getALlCustomers();
    }
    @GetMapping("/{id}")
    public CustomerDTO getCustomerById(@PathVariable Long id){
        return customerServiceImpl.getCustomerById(id);
    }
    @PostMapping
    public CustomerDTO createCustomer(@RequestBody CustomerDTO customerDTO){
        return  customerServiceImpl.createCustomer(customerDTO);
    }
    @PutMapping("/{id}")
    public CustomerDTO updateCustomer(@PathVariable Long id, @RequestBody CustomerDTO customerDTO){
        return customerServiceImpl.updateCustomer(id, customerDTO);
    }
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id){
        customerServiceImpl.deleteCustomer(id);
    }
}
