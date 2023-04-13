package com.precioso.inclass_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        List<ProductModel> productModelList = createList();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ProductAdapter(getApplicationContext(),productModelList));

    }

    List<ProductModel> createList() {
        List<ProductModel> list = new ArrayList<>();
        list.add(new ProductModel("001", "Lays 100gm", "$10", "https://i5.walmartimages.com/asr/3b945e17-b0f0-4e88-9ff3-e21505667c0c.96d85eeb24d9e2e7245bb0b10380e872.jpeg"));
        list.add(new ProductModel("002", "Banana", "$07", "https://t1.gstatic.com/licensed-image?q=tbn:ANd9GcTYSv-kmEqeAj6NRr09yPqvo3HGVdDsuw9ZGKRfpl9EtI6zttIJyRv7WSCMK_4eAsrm"));
        list.add(new ProductModel("003", "Brita Filter", "$77", "https://i5.walmartimages.ca/images/Enlarge/425/567/999999-60258425567.jpg"));
        list.add(new ProductModel("004", "Apple", "$03", "https://i5.walmartimages.ca/images/Enlarge/094/514/6000200094514.jpg"));
        list.add(new ProductModel("005", "iPhone 12 Pro", "$777", "https://i5.walmartimages.com/asr/ea1ffdd7-204e-49ee-a1ff-0ec412b07529.9d92fcadb301c6737103f81487b06dfc.jpeg?odnHeight=450&odnWidth=450&odnBg=ffffff"));
        list.add(new ProductModel("006", "Macbook Pro", "$1777", "https://www.macworld.com/wp-content/uploads/2023/01/2023-MacBook-Pro-models-13.jpg?quality=50&strip=all&w=1024"));
        list.add(new ProductModel("007", "Earphones", "$51", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTEjHXEoE65usaMOJflfk4Vv-s-u4bFxB9O8A&usqp=CAU"));
        list.add(new ProductModel("008", "T-Shirt", "$17", "https://imgs.michaels.com/MAM/assets/1/5E3C12034D34434F8A9BAAFDDF0F8E1B/img/4A6C11A35D1249A7AC437B6CCD831B99/M10093625_5.jpg?fit=inside|540:540"));
        list.add(new ProductModel("009", "Table 10*10", "$233", "https://structube.com/media/catalog/product/0/1/01-61.82.01.97_diningtable_jerry.jpg?auto=webp&format=pjpg&width=750&height=581.6666666666666&fit=bounds&bg-color=f2f2f2&canvas=750,581.6666666666666"));
        list.add(new ProductModel("010", "Napkin", "$13", "https://m.media-amazon.com/images/W/IMAGERENDERING_521856-T1/images/I/81EIIWMG26L._AC_SL1500_.jpg"));

        return list;
    }
}



