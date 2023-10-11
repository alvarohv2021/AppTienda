package com.example.apptienda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
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

        // Obtener el precio actual del TextView asociado al botón
        String precioActual = ((TextView) ((ViewGroup) view.getParent()).getChildAt(2)).getText().toString();

        // Eliminar el símbolo de euro (€) y convertir el precio a un número
        int precioProducto = Integer.parseInt(precioActual.replace("€", ""));

        // Actualizar el total del precio y la cantidad
        String totalPrecio = viewTotalPrecio.getText().toString();
        int precioTotalProductos = Integer.parseInt(totalPrecio.replace("€", ""));
        int cantidadTotal = Integer.parseInt(viewCantidadTotal.getText().toString());

        // Actualizar el total del precio y la cantidad
        viewTotalPrecio.setText((precioTotalProductos + precioProducto) + "€");
        // Eliminar el símbolo de euro (€) y convertir el precio a un número

        viewCantidadTotal.setText((cantidadTotal + 1) + "");
    }

}