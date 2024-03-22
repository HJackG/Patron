package com.joaquin.product.model.repositories;

import java.util.ArrayList;
import com.joaquin.product.model.entities.Producto;

public class ProductRepository {

    private ArrayList<Producto> listProduct;


    public ProductRepository() {
        this.listProduct = new ArrayList<>();
    }

    public void addListProduct(Producto pro)
    {
        this.listProduct.add(pro);
    }
}
