package com.example.myapplication;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.ArrayList;

class productadapter extends RecyclerView.Adapter<productadapter.viewHolder> {
    Context context;
    ArrayList<productmodel> arrayList1;

    public productadapter(Context context, ArrayList<productmodel> arrayList1) {
        this.context = context;
        this.arrayList1 = arrayList1;
    }

    @Override
    public productadapter.viewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_view_list, viewGroup, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(productadapter.viewHolder viewHolder, int position) {
        viewHolder.iconname.setText(arrayList1.get(position).getSaveprice());
        viewHolder.icon.setImageResource(arrayList1.get(position).getImage());
        viewHolder.productname.setText(arrayList1.get(position).getProductname());
        viewHolder.productprice.setText(arrayList1.get(position).getProductprice());
        viewHolder.productprice2.setText(arrayList1.get(position).getProductprice2());
        viewHolder.addproduct.setText(arrayList1.get(position).getAddproduct());
    }

    @Override
    public int getItemCount() {
        return arrayList1.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        public BreakIterator iconName;
        ImageView icon;
        TextView iconname,productname,productprice,productprice2,addproduct;

        public viewHolder(View itemView) {
            super(itemView);
            icon = (ImageView) itemView.findViewById(R.id.icon);
            iconname = (TextView) itemView.findViewById(R.id.iconname);
            productname = (TextView) itemView.findViewById(R.id.productname);
            productprice = (TextView) itemView.findViewById(R.id.productprice);
            productprice2 = (TextView) itemView.findViewById(R.id.productprice2);
            addproduct = (TextView) itemView.findViewById(R.id.addproduct);

        }
    }
}