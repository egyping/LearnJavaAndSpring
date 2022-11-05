package com.amigosmaster.amigosmaster.Product;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class Product {
    private Long id;
    private Integer sku;
    @NotBlank
    private String title;

    //@JsonIgnore // to ignore password form showing in the json
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) //allow write only and not read
    private final String password;

    @NotBlank
    @Email
    private final String email;

    public Product(Long id, Integer sku, String title, String password, String email) {
        this.id = id;
        this.sku = sku;
        this.title = title;
        this.password = password;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("sku_num")
    public Integer getSku() {
        return sku;
    }
    public Integer getSkuNumber() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", sku=" + sku +
                ", title='" + title + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
