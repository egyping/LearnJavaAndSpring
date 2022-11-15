package com.property.propertymanagement.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class PropertyDTO {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private String address;
    private Long userId;

}
