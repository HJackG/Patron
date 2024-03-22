package com.joaquin.product.control;

import com.joaquin.product.model.repositories.ProductRepository;
import com.joaquin.product.model.entities.Producto;

import com.joaquin.product.view.ProductView;

public class ProductController {

    ProductView productView;
    ProductRepository productRepository;

    public ProductController(ProductView productView, ProductRepository productRepository) {
        this.productView = productView;
        this.productRepository = productRepository;
    }

    public void createProduct()
    {
        //crear producto
        Producto pro =  this.productView.creatProducto();

        //guardar producto
        this.productRepository.addListProduct(pro);

        //mostrar producto
        this.productView.viewProduct(pro);
    }
}
