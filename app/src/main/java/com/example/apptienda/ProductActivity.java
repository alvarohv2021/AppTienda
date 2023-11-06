package com.example.apptienda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_activity);

        Intent intent = getIntent();
        CProduct CProduct = (CProduct) intent.getExtras().get("PROCUCT");

        introducirContenido(CProduct);
    }

//Esta parte es para cuando se pulse el floatingButton y se cree un nuevo producto
    private void introducirContenido(CProduct CProduct) {
        ImageView imagenProducto;
        TextView nombreProducto;
        TextView precioProducto;
        TextView descripcionProducto;

        imagenProducto = findViewById(R.id.imagen);
        nombreProducto = findViewById(R.id.nombre);
        precioProducto = findViewById(R.id.precio);
        descripcionProducto = findViewById(R.id.descripcion);

        imagenProducto.setImageResource(CProduct.getImagen());
        nombreProducto.setText(CProduct.getNombre());
        precioProducto.setText(CProduct.getPrecio() + "");
        descripcionProducto.setText(CProduct.getDescripcion());

    }
}