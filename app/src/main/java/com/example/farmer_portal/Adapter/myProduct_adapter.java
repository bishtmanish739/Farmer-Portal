package com.example.farmer_portal.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.farmer_portal.Classes.Addproduct;
import com.example.farmer_portal.R;

import java.util.ArrayList;
import java.util.List;

public class myProduct_adapter extends RecyclerView.Adapter<myProduct_adapter.myProductholder>  {


    public myProduct_adapter(List<Addproduct> product) {
        this.product = product;
    }

    private List<Addproduct> product=new ArrayList<>();

    @NonNull
    @Override
    public myProduct_adapter.myProductholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.product_items,parent,false);
        return new myProduct_adapter.myProductholder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull myProduct_adapter.myProductholder holder, int position) {
        Addproduct currentnote=product.get(position);
        holder.title.setText(currentnote.getName());
        holder.category.setText(currentnote.getCategory());
        holder.quantity.setText(String.valueOf(currentnote.getQuantity()));
    }

    @Override
    public int getItemCount() {
        return product.size();
    }

    class myProductholder extends RecyclerView.ViewHolder{
        private TextView title;
        private TextView category;
        private TextView quantity;

        public myProductholder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.producttitle);
            category=itemView.findViewById(R.id.productcategory);
            quantity=itemView.findViewById(R.id.productquantity);
        }
    }
}