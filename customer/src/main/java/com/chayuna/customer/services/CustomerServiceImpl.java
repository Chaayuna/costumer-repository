package com.chayuna.customer.services;


import com.chayuna.customer.dtos.CustomerDTO;
import com.chayuna.customer.entities.Customer;
import com.chayuna.customer.mapper.CustomerMapper;
import com.chayuna.customer.repositories.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper mapper;

    public CustomerServiceImpl(CustomerRepository carCustomerRepository, CustomerMapper mapper){
        this.customerRepository = carCustomerRepository;
        this.mapper = mapper;
    }
    /**
     * @return
     */
    @Override
    public List<CustomerDTO> getALlCustomers() {
        List<Customer>  customers = customerRepository.findAll();
        return mapper.customersToCustomerDTOs(customers);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public CustomerDTO getCustomerById(Long id) {
        Customer customer = customerRepository.findById(id).orElseThrow();
        return mapper.customerToCustomerDTO(customer);
    }

    /**
     * @param customerDTO
     * @return
     */
    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        //converting CustomerDTO object to Customer Entity
        Customer customer = mapper.customerDTOToCustomer(customerDTO);
        Customer savedCustomer = customerRepository.save(customer);
        return  mapper.customerToCustomerDTO(savedCustomer);

    }

    /**
     * @param id
     * @param customerDTO
     * @return
     */
    @Override
    public CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO) {
        Customer customer = customerRepository.findById(id).orElseThrow();
        //Updating customer entity fields based on customerDTO (no seetters needed tho)
        customer.setName(customerDTO.name());
        customer.setTel(customerDTO.tel());
        customer.setEmail(customerDTO.email());
        customer.setBirthdate(customerDTO.birthDate());
        Customer updatedCustomer = customerRepository.save(customer);
        return mapper.customerToCustomerDTO(updatedCustomer);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
