package com.example.apptienda;

import java.util.ArrayList;

public class ProductList {
    ArrayList<CProduct> CProductList = new ArrayList<>();

    // constructor


    public ProductList() {
        this.CProductList = CProductList;
    }

    public void createProductList() {

        // Agrega productos a la lista
        CProductList.add(new CProduct(R.drawable.carne, "Carne", 29.99F, "Este producto es carne y está en buen estado."));
        CProductList.add(new CProduct(R.drawable.loaf, "Pan", 1.99F, "Este es un pan fresco y delicioso."));
        CProductList.add(new CProduct(R.drawable.orange, "Naranja", 39.99F, "Naranjas frescas y jugosas."));
        CProductList.add(new CProduct(R.drawable.lemon, "Limón", 24.99F, "Limones frescos y ácidos."));
        CProductList.add(new CProduct(R.drawable.pear, "Pera", 34.99F, "Peras jugosas y sabrosas."));
        CProductList.add(new CProduct(R.drawable.apple, "Manzana", 19.99F, "Manzanas crujientes y deliciosas."));
        CProductList.add(new CProduct(R.drawable.carrot, "Zanahoria", 29.99F, "Zanahorias frescas y saludables."));
        CProductList.add(new CProduct(R.drawable.coffee, "Café", 49.99F, "Café de alta calidad para disfrutar."));
        CProductList.add(new CProduct(R.drawable.pizza, "Pizza", 39.99F, "Pizza deliciosa lista para calentar."));
        CProductList.add(new CProduct(R.drawable.potatoes, "Patatas", 14.99F, "Patatas frescas para cocinar como desees."));

    }

    public CProduct getProduct(int position) {
        return CProductList.get(position);
    }

    public int getSize() {
        return CProductList.size();
    }

    public void remove(int posicion) {
        CProductList.remove(posicion);
    }
}
