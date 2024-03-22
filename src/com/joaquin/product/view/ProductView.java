package com.joaquin.product.view;

import com.joaquin.product.model.entities.producto;

import java.util.Scanner;

public class ProductView {

    public void viewProduct(producto pro)
    {
        System.out.println("nombre " + pro.getNameProduct());//Get para mostrar el producto
        System.out.println("id " + pro.getId());

    }

    public producto creatProducto()
    {
        Scanner in =new Scanner(System.in);

        System.out.println("Ingrese el id" );
        Integer id = in.nextInt();

        in.nextLine();

        System.out.println("Ingrese nombre");
        String nombre = in.nextLine();

        return new producto(id,nombre);//producto newpro = new producto(id,nombre);//Es lo mismo

    }
}
