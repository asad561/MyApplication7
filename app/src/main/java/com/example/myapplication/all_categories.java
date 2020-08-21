package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

public class all_categories extends product_header {

    Toolbar toolbar;
    ArrayList<all_category_model> arrayList;
    RecyclerView recyclerView;
    String all_category[] = {"Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello","Hello"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout content = findViewById(R.id.framelayout_id_product);
        getLayoutInflater().inflate(R.layout.activity_all_categories,content);


        toolbar = (Toolbar) findViewById(R.id.toolbar_id);
        toolbar.setTitle("title");
        recyclerView = (RecyclerView) findViewById(R.id.recycleveiw);

        arrayList = new ArrayList<all_category_model>();
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        for (int i = 0; i < all_category.length; i++) {
            all_category_model all_category_model = new all_category_model();
            all_category_model.setAll_category(all_category[i]);

            arrayList.add(all_category_model);
        }
        CustomAdapter2 adapter5 = new CustomAdapter2(getApplicationContext(), arrayList);
        recyclerView.setAdapter(adapter5);
        }
    }

