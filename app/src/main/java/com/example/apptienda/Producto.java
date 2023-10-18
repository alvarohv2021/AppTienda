package com.example.apptienda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;

public class Producto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);

        // Recupera el objeto Parcelable del Intent
        Intent intent = getIntent();
        Parcelable parcelable = intent.getParcelableExtra("producto");

        // Verifica que el objeto sea del tipo esperado y luego cástalo
        if (parcelable instanceof CProducto) {
            CProducto producto = (CProducto) parcelable;

            // Ahora puedes trabajar con el objeto recuperado
            String nombre = producto.getNombre();
            int precio = producto.getPrecio();

            // Realiza las operaciones necesarias con el objeto recuperado
        } else {
            // Manejar el caso en el que el objeto no es del tipo esperado
        }
    }


}