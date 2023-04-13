package com.precioso.inclass_5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<MyViewHolder> {


    Context context;
    List<ProductModel> productsList;

    public ProductAdapter(Context context, List<ProductModel> productsList){
        this.context = context;
        this.productsList = productsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.productcard,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(productsList.get(position).getName());
        holder.id.setText(productsList.get(position).getId());
        holder.price.setText(productsList.get(position).getPrice());
        Picasso.get().load(productsList.get(position).getImage()).into(holder.imageView);
    }


    @Override
    public int getItemCount() {
            return productsList.size();
    }
}





