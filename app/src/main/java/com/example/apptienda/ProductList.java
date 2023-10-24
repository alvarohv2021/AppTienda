package com.example.apptienda;

import java.util.ArrayList;

public class ProductList {
    public static ArrayList<Product> createProductList() {

        ArrayList<Product> productList = new ArrayList<>();

        // Agrega productos a la lista
        productList.add(new Product(R.drawable.carne, "Carne", 29.99F));
        productList.add(new Product(R.drawable.loaf, "Pan", 1.99F));
        productList.add(new Product(R.drawable.orange, "Naranja", 39.99F));
        productList.add(new Product(R.drawable.lemon, "Limón", 24.99F));
        productList.add(new Product(R.drawable.pear, "Pera", 34.99F));
        productList.add(new Product(R.drawable.apple, "Manzana", 19.99F));
        productList.add(new Product(R.drawable.carrot, "Zanahoria", 29.99F));
        productList.add(new Product(R.drawable.coffee, "Café", 49.99F));
        productList.add(new Product(R.drawable.pizza, "Pizza", 39.99F));
        productList.add(new Product(R.drawable.potatoes, "Patatas", 14.99F));

        return productList;
    }
}
