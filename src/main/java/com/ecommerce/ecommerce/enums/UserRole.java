package com.ecommerce.ecommerce.enums;

public enum UserRole {
    BUYER("BUYER"),
    MANAGER("MANAGER"),
    SELLER("SELLER");

    private String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

}
