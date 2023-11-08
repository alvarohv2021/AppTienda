package com.example.apptienda;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialogFragment;

public class AddProductDialog extends AppCompatDialogFragment {

    public EditText viewNombre;
    public EditText viewPrecio;
    public EditText viewDescripcion;
    private AddProductToRecyclerView addProductToRecyclerView;


    public Dialog onCreateDialog(@NonNull Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = this.getLayoutInflater();
        View view = inflater.inflate(R.layout.upload_product_dialog, null);

        viewNombre = view.findViewById(R.id.nombreUploadProduct);
        viewDescripcion = view.findViewById(R.id.descripcionUploadProduct);
        viewPrecio = view.findViewById(R.id.precioUploadProduct);

        builder.setView(view).setPositiveButton("Upload", (dialogInterface, i) -> {

            String nombre = viewNombre.getText().toString();
            String descricion = viewDescripcion.getText().toString();
            Float precio = Float.valueOf(viewPrecio.getText().toString());

            CProduct product = new CProduct(0, nombre, precio, descricion);

            addProductToRecyclerView.addProductToRecyclerView(product);
        });

        builder.setView(view).setNegativeButton("Cancel", (dialogInterface, i) -> {

        });

        return null;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        addProductToRecyclerView = (AddProductToRecyclerView) context;
    }

}

