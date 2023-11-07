package com.example.apptienda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements añadirProductos {
    private TextView precioTotalView;
    private TextView cantidadTotalView;
    private float total;
    private int cantidadTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getViewsCarrito();

        RecyclerView recyclerView = findViewById(R.id.product_list_recycler);

        ProductList productList = new ProductList();
        productList.createProductList();

        Product_RecyclerViewAdapter product_recyclerViewAdapter = new Product_RecyclerViewAdapter(recyclerView.getContext(), productList, this);

        recyclerView.setAdapter(product_recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getViewsCarrito() {
        precioTotalView = findViewById(R.id.precioTotal);
        cantidadTotalView = findViewById(R.id.cantidadTotal);

        total = Float.parseFloat(precioTotalView.getText().toString());
        cantidadTotal = Integer.parseInt(cantidadTotalView.getText().toString());
    }

    @Override
    public void añadirProducto(int position, float precio) {
        total += precio;
        cantidadTotal++;

        //Con esto forzamos a que el resultado de la suma del producto seleccionado con el valor total
        // de carrito este siempre representado con solo dos decimales
        String stringTotal = String.format("%.2f", total);

        precioTotalView.setText("Total: " + stringTotal + "€");
        cantidadTotalView.setText(cantidadTotal + "");
    }
}