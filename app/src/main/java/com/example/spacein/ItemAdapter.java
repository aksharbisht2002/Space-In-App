package com.example.spacein;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

     public List<Items> items;
     public Context context ;

    public ItemAdapter(List<Items> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_list,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Items item = items.get(position);
        holder.image.setImageResource(item.getImage());
        holder.name.setText(item.getName());

        int pos = holder.getAdapterPosition();

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent screenDetail = new Intent(context.getApplicationContext(),cons_details.class);
                screenDetail.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                screenDetail.putExtra("pos",pos);
               context.getApplicationContext().startActivity(screenDetail);
            }
        });
    }

    @Override
    public int getItemCount() {

        return items.size();
    }

    public static class ViewHolder extends  RecyclerView.ViewHolder {

        ImageView image;
        TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image_planet);
            name = itemView.findViewById(R.id.tv_name);

        }
    }
}
