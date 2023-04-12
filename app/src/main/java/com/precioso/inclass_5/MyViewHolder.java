package com.precioso.inclass_5;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView name, id, price;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.image);
        name = itemView.findViewById(R.id.name);
        id = itemView.findViewById(R.id.id);
        price = itemView.findViewById(R.id.price);
    }
}
