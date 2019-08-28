package com.example.allaboutmusic;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    List<Model> my_list;
    Context context;

    public CustomAdapter(List<Model> my_list, Context context){
        this.my_list = my_list;
        this.context = context;
    }


    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_musik,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {
            final Model model  = my_list.get(position);
            holder.name.setText(model.getPlayer_name());
            holder.role.setText(model.getPlayer_role());
            holder.image.setImageDrawable(context.getResources().getDrawable(model.getImage()));
            holder.relative.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context,DetailKurt.class);
                    intent.putExtra("image",model.getImage());
                    intent.putExtra("name",model.getPlayer_name());
                    intent.putExtra("role",model.getPlayer_role());
                    context.startActivity(intent);
                }
            });

    }

    @Override
    public int getItemCount() {
        return my_list.size();
    }

     class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView name,role;
        RelativeLayout relative;

        public MyViewHolder(View itemView){
            super(itemView);
            image =itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            role = itemView.findViewById(R.id.role);
            relative = itemView.findViewById(R.id.relative);
        }
    }
}
