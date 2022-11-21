package com.property.propertymanagement.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class UserDTO {


    private String ownerName;
    private String ownerEmail;
    private String phone;
    private String password;
}
