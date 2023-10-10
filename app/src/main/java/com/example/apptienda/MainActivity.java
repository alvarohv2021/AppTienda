package com.example.apptienda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void añadir(View view) {

        TextView viewTotalPrecio = findViewById(R.id.precioTotal);
        TextView viewCantidadTotal = findViewById(R.id.cantidadTotal);

        int totalPrecio = Integer.parseInt(viewTotalPrecio.getText().toString());
        int cantidadTotal = Integer.parseInt(viewCantidadTotal.getText().toString());

        viewTotalPrecio.setText(totalPrecio+1+"");
        viewCantidadTotal.setText(cantidadTotal+1+"");

    }
}