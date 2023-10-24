package com.example.apptienda;

import static com.example.apptienda.ProductList.createProductList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.product_list_recycler);
        ArrayList<Product> listaProductos = createProductList();
        Product_RecyclerViewAdapter product_recyclerViewAdapter = new Product_RecyclerViewAdapter(recyclerView.getContext(), listaProductos);

        recyclerView.setAdapter(product_recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void añadir(View view) {


    }

/*
    public void info(View view) {
        Intent activityProducto = new Intent(this, Product.class);
        activityProducto.putExtra("producto", (Parcelable) producto);

        startActivity(activityProducto);

    }
*/
}