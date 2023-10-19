package com.example.apptienda;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ReciclerViewAdapter extends RecyclerView.Adapter<RecyclerView.MyHolder> {


    @NonNull
    @Override
    public RecyclerView.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.MyHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        //el 0 se cambia por el tamaño de la lista de productos
        return 0;
    }

    public static class MyHolder extends RecyclerView.ViewHolder{

        public MyHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
