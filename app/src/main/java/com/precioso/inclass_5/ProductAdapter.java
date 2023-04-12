package com.precioso.inclass_5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {


    private ArrayList<ProductModel> productsList;

    public ProductAdapter(ArrayList<ProductModel> products) {
        this.productsList = products;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.productcard, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ProductModel products = productsList.get(position);
        holder.name.setText(products.getName());
        holder.price.setText(products.getPrice());
        holder.id.setText(products.getId());
//        Picasso.get().load(products.getImage()).into(holder.image);
    }



    @Override
    public int getItemCount() {
        if(list != null){
            return list.size();
        }else {
            return 0;
        }
    }

    ArrayList<ProductModel> list;


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final View view;
        public final TextView name;
        public final TextView id;
        public final TextView price;
//        public final ImageView image;

        public ViewHolder(View view) {
            super(view);
            this.view = view;
            name = view.findViewById(R.id.name);
            price = view.findViewById(R.id.price);
//            image = view.findViewById(R.id.image);
            id = view.findViewById(R.id.id);
        }
    }
}





