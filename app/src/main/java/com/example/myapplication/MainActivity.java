package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends header {


    TextView textView2;
    //horizontal_menu_list
    public List<hmenulist> movieList = new ArrayList<>();
    public hmenuadapter mAdapter;
    //horizontal_menu_list_end
    //Banner_cards
    ArrayList<cardmodel> arrayList;
    //Home_screen_products
    ArrayList<productmodel> arrayList1;
    RecyclerView recyclerView;
    int icons[] = {R.drawable.dsa, R.drawable.dsa, R.drawable.dsa, R.drawable.dsa, R.drawable.dsa, R.drawable.dsa, R.drawable.dsa, R.drawable.dsa, R.drawable.dsa};
    String iconsName[] = {"Test", "Test", "Test", "Test", "Test", "Test", "Test", "Test", "Test"};
    String iconname[] = {"Save Up To 40%","Save Up To 40%","Save Up To 40%","Save Up To 40%","Save Up To 40%","Save Up To 40%","Save Up To 40%","Save Up To 40%","Save Up To 40%"};
    int iconss[] = {R.drawable.dsa, R.drawable.dsa, R.drawable.dsa, R.drawable.dsa, R.drawable.dsa, R.drawable.dsa, R.drawable.dsa, R.drawable.dsa, R.drawable.dsa};
    //"Dressed Chicken (with skin)(1kg)"
    String productname[] = {"Dressed Chicken (with skin)(1kg)","Dressed Chicken (with skin)(1kg)","Dressed Chicken (with skin)(1kg)","Dressed Chicken (with skin)(1kg)","Dressed Chicken (with skin)(1kg)","Dressed Chicken (with skin)(1kg)","Dressed Chicken (with skin)(1kg)","Dressed Chicken (with skin)(1kg)","Dressed Chicken (with skin)(1kg)"};
    String productprice[] = {"Rs.450","Rs.450","Rs.450","Rs.450","Rs.450","Rs.450","Rs.450","Rs.450","Rs.450"};
    String productprice2[] = {"Rs.500","Rs.500","Rs.500","Rs.500","Rs.500","Rs.500","Rs.500","Rs.500","Rs.500"};
    String addproduct[] = {"Add","Add","Add","Add","Add","Add","Add","Add","Add"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout content = findViewById(R.id.framelayout_id);
        getLayoutInflater().inflate(R.layout.activity_main,content);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerView recyclerView1 = findViewById(R.id.recycler_view1);
        RecyclerView recyclerView2 = findViewById(R.id.recycler_view22);
        RecyclerView recyclerView3 = findViewById(R.id.recycler_view212);
        arrayList1 = new ArrayList<productmodel>();
        arrayList = new ArrayList<>();
        mAdapter = new hmenuadapter(movieList);
        textView2 = (TextView) findViewById(R.id.allcategory);

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,all_categories.class);
                startActivity(intent);
            }
        });


        //Horizontal_menu_list
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();
        //Horizontal_menu_list_end

        //Home_Screen_Products
        recyclerView1.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        for (int i = 0; i < icons.length; i++) {
            cardmodel itemModel = new cardmodel();
            itemModel.setImage(icons[i]);
            itemModel.setName(iconsName[i]);

            //add in array list
            arrayList.add(itemModel);
        }
        cardadapter adapter = new cardadapter(getApplicationContext(), arrayList);
        recyclerView1.setAdapter(adapter);

        //for Products
        recyclerView2.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView2.setItemAnimator(new DefaultItemAnimator());
        recyclerView3.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL,false));
        recyclerView3.setItemAnimator(new DefaultItemAnimator());

        for (int i = 0; i < iconss.length; i++) {
            productmodel itemModels = new productmodel();
            itemModels.setImage(icons[i]);
            itemModels.setSaveprice(iconname[i]);
            itemModels.setProductname(productname[i]);
            itemModels.setProductprice(productprice[i]);
            itemModels.setProductprice2(productprice2[i]);
            itemModels.setAddproduct(addproduct[i]);

            //add in array list
            arrayList1.add(itemModels);
        }

        productadapter adapter1 = new productadapter(getApplicationContext(), arrayList1);
        recyclerView2.setAdapter(adapter1);
        recyclerView3.setAdapter(adapter1);


    }


    private void prepareMovieData() {
        hmenulist movie = new hmenulist("Hello");
        movieList.add(movie);

        hmenulist movies = new hmenulist("Hello");
        movieList.add(movies);

        hmenulist moviess = new hmenulist("Hello");
        movieList.add(moviess);

        hmenulist moviese = new hmenulist("Hello");
        movieList.add(moviese);

        hmenulist moviesa = new hmenulist("Hello");
        movieList.add(moviesa);

        hmenulist movies2 = new hmenulist("Hello");
        movieList.add(movies2);

        hmenulist movies3 = new hmenulist("Hello");
        movieList.add(movies3);

        hmenulist movies4 = new hmenulist("Hello");
        movieList.add(movies4);

        hmenulist movies5 = new hmenulist("Hello");
        movieList.add(movies5);

        hmenulist movies6 = new hmenulist("Hello");
        movieList.add(movies6);
        mAdapter.notifyDataSetChanged();
    }
}
