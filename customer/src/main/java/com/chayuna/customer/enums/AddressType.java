package com.chayuna.customer.enums;

public enum AddressType {

    AVENUE("Home"),
    STREET("Work");
    private final String description;

    AddressType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
