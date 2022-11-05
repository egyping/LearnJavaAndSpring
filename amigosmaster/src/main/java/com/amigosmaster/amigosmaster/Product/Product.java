package com.amigosmaster.amigosmaster.Product;

public class Product {
    private Long id;
    private Integer sku;
    private String title;
    private final String password;

    public Product(Long id, Integer sku, String title, String password) {
        this.id = id;
        this.sku = sku;
        this.title = title;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
                '}';
    }
}
