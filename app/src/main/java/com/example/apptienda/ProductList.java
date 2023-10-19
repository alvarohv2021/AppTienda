package com.example.apptienda;

import java.util.ArrayList;

public class ProductList {
    public static ArrayList<Product> createProductList() {
        ArrayList<Product> productList = new ArrayList<>();

        // Agrega productos a la lista
        productList.add(new Product(1, "Manzana", 29.99F));
        productList.add(new Product(2, "Plátano", 19.99F));
        productList.add(new Product(3, "Naranja", 39.99F));
        productList.add(new Product(4, "Uva", 24.99F));
        productList.add(new Product(5, "Pera", 34.99F));
        productList.add(new Product(6, "Kiwi", 19.99F));
        productList.add(new Product(7, "Fresa", 29.99F));
        productList.add(new Product(8, "Mango", 49.99F));
        productList.add(new Product(9, "Cereza", 39.99F));
        productList.add(new Product(10, "Limón", 14.99F));
        productList.add(new Product(11, "Papaya", 29.99F));
        productList.add(new Product(12, "Ciruela", 19.99F));
        productList.add(new Product(13, "Sandía", 44.99F));
        productList.add(new Product(14, "Melón", 39.99F));
        productList.add(new Product(15, "Granada", 54.99F));

        return productList;

    }
}
