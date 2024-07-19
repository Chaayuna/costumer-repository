package com.chayuna.customer.dtos;

import java.time.LocalDate;

public record CustomerDTO(String name, LocalDate birthDate, String tel, String email) {

}
