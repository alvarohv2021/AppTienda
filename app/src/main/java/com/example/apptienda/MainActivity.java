package com.example.apptienda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements añadirProductos, AddProductToRecyclerView {
    private TextView precioTotalView;
    private TextView cantidadTotalView;
    private float total;
    private int cantidadTotal;
    private Product_RecyclerViewAdapter product_recyclerViewAdapter;
    private ProductList productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getViewsCarrito();

        RecyclerView recyclerView = findViewById(R.id.product_list_recycler);

        productList = new ProductList();
        productList.createProductList();

        product_recyclerViewAdapter = new Product_RecyclerViewAdapter(recyclerView.getContext(), productList, this);

        recyclerView.setAdapter(product_recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Button añadirProductoAlRecyclerView = findViewById(R.id.añadirProducto);

        añadirProductoAlRecyclerView.setOnClickListener(view -> {
            AddProductDialog addProductDialog = new AddProductDialog();
            addProductDialog.show(getSupportFragmentManager(), "");

        });

    }

    private void getViewsCarrito() {
        precioTotalView = findViewById(R.id.precioTotal);
        cantidadTotalView = findViewById(R.id.cantidadTotal);

        total = Float.parseFloat(precioTotalView.getText().toString());
        cantidadTotal = Integer.parseInt(cantidadTotalView.getText().toString());
    }

    @Override
    public void añadirProductoAlCarrito(int position, float precio) {
        //Añade el precio del producto al total del carrito y al total de productos en este
        total += precio;
        cantidadTotal++;

        //Con esto forzamos a que el resultado de la suma del producto seleccionado con el valor total
        // de carrito este siempre representado con solo dos decimales
        String stringTotal = String.format("%.2f", total);

        precioTotalView.setText("Total: " + stringTotal + "€");
        cantidadTotalView.setText(cantidadTotal + "");
    }

    @Override
    public void addProductToRecyclerView(CProduct product) {

        productList.addProducto(product);
        product_recyclerViewAdapter.notifyDataSetChanged();


    }
}