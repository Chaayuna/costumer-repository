package com.chayuna.customer.entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Getter
@Setter
@Entity
@Table(name = "CUSTOMER")
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;
    LocalDate birthdate;
    String tel;
    String email;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthdate +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
