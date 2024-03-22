package com.joaquin.product.model.entities;

public class Producto {

    private  Integer id;
    private String nameProduct;

    public Producto(Integer id, String nameProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
}
