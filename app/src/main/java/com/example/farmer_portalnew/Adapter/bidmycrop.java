package com.example.farmer_portalnew.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.farmer_portalnew.Classes.Addproduct;
import com.example.farmer_portalnew.Classes.bidding;
import com.example.farmer_portalnew.R;

import java.util.ArrayList;
import java.util.List;

public class bidmycrop extends RecyclerView.Adapter<bidmycrop.bidmycropholder> {
    public bidmycrop(List<bidding> bidmycroplist) {
        this.bidmycroplist = bidmycroplist;
    }

    private List<bidding> bidmycroplist=new ArrayList<>();

    @NonNull
    @Override
    public bidmycropholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.mybiddingitem,parent,false);
        return new bidmycrop.bidmycropholder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull bidmycropholder holder, int position) {
        final bidding currentnote=bidmycroplist.get(position);
        holder.title.setText(currentnote.getPrice());
      //  holder.quantity.setText(String.valueOf(currentnote.getQuantity()));
    //    holder.category.setText(String.valueOf(currentnote.getCategory()));
 //       holder.Bid.setText(String.valueOf(currentnote.getBid()));
   //     holder.cropprice.setText(String.valueOf(currentnote.getCropPrice()));
    //    holder.phone.setText(String.valueOf(currentnote.getFarmerphone()));
     //   holder.name.setText(String.valueOf(currentnote.getFarmername()));
        holder.farmerorbuyer.setText("Buyer Details");
    }

    @Override
    public int getItemCount() {
        return bidmycroplist.size();
    }

    class bidmycropholder extends RecyclerView.ViewHolder{
        private TextView title;
        private TextView category;
        private TextView quantity,Bid,cropprice,name,phone,farmerorbuyer;

        public bidmycropholder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.producttitle1);
            category=itemView.findViewById(R.id.productcategory1);
            quantity=itemView.findViewById(R.id.productquantity1);
           farmerorbuyer=itemView.findViewById(R.id.farmerorbuyer);
            Bid=itemView.findViewById(R.id.Bidprice);
            name=itemView.findViewById(R.id.mybidname);
            phone=itemView.findViewById(R.id.mybidphone);
            cropprice=itemView.findViewById(R.id.PriceOfCrop1);
        }
    }
}

