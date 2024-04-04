package com.eliasfs06.spring.projectkickoff.model.enums;

public enum UserRole {

    ADMIN("admin"),
    USER("user");

    private String description;

    UserRole(String description) {
        this.description = description;
    }


    public String getDescription(){
        return this.description;
    }
}
