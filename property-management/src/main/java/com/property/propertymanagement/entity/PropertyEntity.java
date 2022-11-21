package com.property.propertymanagement.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

// Entity and Table to make the class as a table in the DB
@Entity
@Table(name = "PROPERTY_TABLE")
// lombok
@Getter
@Setter
@NoArgsConstructor
public class PropertyEntity {

    // ID and generated value makes the field PK
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // to change the field name in the table rather than the default name
    @Column(name = "PROPERTY_TITLE", nullable = false)
    private String title;
    private String description;
    private Double price;
    private String address;
}
