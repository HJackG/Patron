package com.joaquin.product.model.repositories;

import java.util.ArrayList;
import com.joaquin.product.model.entities.producto;

public class ProductRepository {

    private ArrayList<producto> listProduct;


    public ProductRepository() {
        this.listProduct = new ArrayList<>();
    }

    public void addListProduct(producto pro)
    {
        this.listProduct.add(pro);
    }
}
