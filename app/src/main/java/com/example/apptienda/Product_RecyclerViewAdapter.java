package com.example.apptienda;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Product_RecyclerViewAdapter extends RecyclerView.Adapter<ReciclerViewAdapter.MyHolder> {
    private Context context;
    private ProductList productList;

    public Product_RecyclerViewAdapter(Context context, ProductList productList){
        this.context = context;
        this.productList=productList;
    }
    @NonNull
    @Override
    public ReciclerViewAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_producto, parent, false);
        return new ReciclerViewAdapter.MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReciclerViewAdapter.MyHolder holder, int position) {
        Product product = productList.get(position);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
