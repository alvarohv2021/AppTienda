package com.example.apptienda;

import static androidx.core.content.ContextCompat.startActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

// imports necessaris

public class Product_RecyclerViewAdapter extends RecyclerView.Adapter<Product_RecyclerViewAdapter.MyViewHolder> {

    // constructor amb Context i productList.
    private Context context;
    private ProductList productList;

    public Product_RecyclerViewAdapter(Context context, ProductList productList) {
        this.context = context;
        this.productList = productList;
    }

    @NonNull
    @Override
    public Product_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Assignar ("inflate") les vistes dels registres al RecyclerView
        // ...
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recicler_view_row, parent, false);
        return new Product_RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    //La variable "position" recibe el valor en el momento en el que se estan creando los distintos elementos,
    // ya que a medida que los crea, les va dando un index al que nosotros en el metodo hemos llamado "position".
    public void onBindViewHolder(@NonNull Product_RecyclerViewAdapter.MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        // Assignar valor als atributs XML (a partir de la posició que ocupen dins
        // l'ArrayList de productes)
        // ...
        holder.imagenProducto.setImageResource(productList.getProduct(position).getImagen());
        holder.nombreProducto.setText(productList.getProduct(position).getNombre());
        holder.precioProducto.setText(productList.getProduct(position).getPrecio() + "");
        holder.descripcionProducto.setText(productList.getProduct(position).getDescripcion() + "");

        holder.botonProducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ProductActivity.class);
                intent.putExtra("PROCUCT", productList.getProduct(position));
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return productList.getSize();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        // Declarar vistes del nostre "Producte"
        // ...
        private ImageView imagenProducto;
        private TextView nombreProducto;
        private TextView precioProducto;
        private TextView descripcionProducto;

        private Button botonProducto;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            // instanciar vistes (recuperar per identificador)
            // ...
            imagenProducto = itemView.findViewById(R.id.imageView);
            nombreProducto = itemView.findViewById(R.id.nombre);
            precioProducto = itemView.findViewById(R.id.precio);
            descripcionProducto = itemView.findViewById(R.id.descripcion);
            botonProducto = itemView.findViewById(R.id.button2);

            itemView.setOnLongClickListener(view -> {
                productList.remove(getAdapterPosition());
                return true;
            });

        }
    }
}