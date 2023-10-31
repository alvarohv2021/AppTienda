package com.example.apptienda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.product_list_recycler);
        //ArrayList<Product> listaProductos = createProductList();

        ProductList productList = new ProductList();
        productList.createProductList();

        Product_RecyclerViewAdapter product_recyclerViewAdapter = new Product_RecyclerViewAdapter(recyclerView.getContext(), productList);

        recyclerView.setAdapter(product_recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}