package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class CustomAdapter2 extends RecyclerView.Adapter<CustomAdapter2.viewHolder> {

    Context context;
    ArrayList<all_category_model> arrayList;

    public CustomAdapter2(Context context, ArrayList<all_category_model> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.all_categories_list, viewGroup, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(viewHolder viewHolder, int position) {
        viewHolder.Category.setText(arrayList.get(position).getAll_category());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        TextView Category;

        public viewHolder(View itemView) {
            super(itemView);
            Category = (TextView) itemView.findViewById(R.id.category);

        }
    }
}

