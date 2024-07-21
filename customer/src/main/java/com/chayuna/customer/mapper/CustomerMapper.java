package com.chayuna.customer.mapper;

import com.chayuna.customer.dtos.CustomerDTO;
import com.chayuna.customer.entities.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDTO customerToCustomerDTO(Customer customer);
    Customer customerDTOToCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> customersToCustomerDTOs(List<Customer> customer);

}
