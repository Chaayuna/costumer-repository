package com.chayuna.customer.dtos;

import com.chayuna.customer.enums.AddressType;

public record AddressDTO(String neighborhood, int number, AddressType type) {
}
