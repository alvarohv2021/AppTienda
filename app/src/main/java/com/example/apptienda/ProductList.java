package com.example.apptienda;

import java.util.ArrayList;

public class ProductList {
    ArrayList<Product> productList = new ArrayList<>();

    // constructor


    public ProductList() {
        this.productList = productList;
    }

    public void createProductList() {

        // Agrega productos a la lista
        productList.add(new Product(R.drawable.carne, "Carne", 29.99F, "Este producto es carne y está en buen estado."));
        productList.add(new Product(R.drawable.loaf, "Pan", 1.99F, "Este es un pan fresco y delicioso."));
        productList.add(new Product(R.drawable.orange, "Naranja", 39.99F, "Naranjas frescas y jugosas."));
        productList.add(new Product(R.drawable.lemon, "Limón", 24.99F, "Limones frescos y ácidos."));
        productList.add(new Product(R.drawable.pear, "Pera", 34.99F, "Peras jugosas y sabrosas."));
        productList.add(new Product(R.drawable.apple, "Manzana", 19.99F, "Manzanas crujientes y deliciosas."));
        productList.add(new Product(R.drawable.carrot, "Zanahoria", 29.99F, "Zanahorias frescas y saludables."));
        productList.add(new Product(R.drawable.coffee, "Café", 49.99F, "Café de alta calidad para disfrutar."));
        productList.add(new Product(R.drawable.pizza, "Pizza", 39.99F, "Pizza deliciosa lista para calentar."));
        productList.add(new Product(R.drawable.potatoes, "Patatas", 14.99F, "Patatas frescas para cocinar como desees."));

    }

    public Product getProduct(int position) {
        return productList.get(position);
    }

    public int getSize() {
        return productList.size();
    }

    public void remove(int product) {
        productList.remove(product);
    }
}
