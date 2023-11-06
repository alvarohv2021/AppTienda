package com.example.apptienda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements añadirProductos {
    private TextView precioTotalView;
    private float total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precioTotalView = findViewById(R.id.precioTotal);
        total = Float.parseFloat(precioTotalView.getText().toString());


        RecyclerView recyclerView = findViewById(R.id.product_list_recycler);

        ProductList productList = new ProductList();
        productList.createProductList();

        Product_RecyclerViewAdapter product_recyclerViewAdapter = new Product_RecyclerViewAdapter(recyclerView.getContext(), productList, this);

        recyclerView.setAdapter(product_recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void añadirProducto(int position, float precio) {
        total += precio;
        precioTotalView.setText("Total: " + total+"€");
    }
}