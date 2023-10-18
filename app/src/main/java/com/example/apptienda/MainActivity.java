package com.example.apptienda;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    CProducto producto = new CProducto("Carne",10);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void añadir(View view) {
        TextView viewPrecioTotal;
        int precioTotla;

        viewPrecioTotal = findViewById(R.id.precioTotal);

        precioTotla = Integer.parseInt(viewPrecioTotal.getText().toString().replace("€", ""));
        precioTotla = producto.getPrecio()+precioTotla;

        viewPrecioTotal.setText(precioTotla+"€");

    }

    public void info(View view) {
        Intent activityProducto = new Intent(this, Producto.class);
        activityProducto.putExtra("producto", (Parcelable) producto);

        startActivity(activityProducto);

    }
}