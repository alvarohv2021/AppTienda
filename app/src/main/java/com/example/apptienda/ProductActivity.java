package com.example.apptienda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_activity);

        Intent intent = getIntent();
        Product product = (Product) intent.getExtras().get("PROCUCT");

        introducirContenido(product);
    }

    private void introducirContenido(Product product) {
        ImageView imagenProducto;
        TextView nombreProducto;
        TextView precioProducto;
        TextView descripcionProducto;

        imagenProducto = findViewById(R.id.imagen);
        nombreProducto = findViewById(R.id.nombre);
        precioProducto = findViewById(R.id.precio);
        descripcionProducto = findViewById(R.id.descripcion);

        imagenProducto.setImageResource(product.getImagen());
        nombreProducto.setText(product.getNombre());
        precioProducto.setText(product.getPrecio() + "");
        descripcionProducto.setText(product.getDescripcion());

    }
}