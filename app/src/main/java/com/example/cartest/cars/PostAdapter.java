package com.example.cartest.cars;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import android.view.View;
import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;

import com.example.cartest.R;

import java.util.List;


public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

  public static class ViewHolder extends RecyclerView.ViewHolder {

      ImageView imageView;
      TextView textViewa,textViewb,textViewc;
      public ViewHolder(View itemView) {
          super(itemView);

       //   imageView = (TextView) itemView.findViewById(R.id.imageView2);
          textViewa = (TextView) itemView.findViewById(R.id.textView);
          textViewb = (TextView) itemView.findViewById(R.id.textView2);
          textViewc = (TextView) itemView.findViewById(R.id.textView3);
      }
  }

    private Context context;
    private List<Car> cars;

    public PostAdapter(Context context, List<Car> cars) {
        this.context =context;
        this.cars = cars;
    }
    @NonNull
    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_view,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PostAdapter.ViewHolder holder, int position) {
      //holder.imageView.setImageResource(items.get(position).getModele());
        holder.textViewa.setText(cars.get(position).getMarque());
        holder.textViewb.setText(cars.get(position).getMiseEnCirculation());
        holder.textViewc.setText(cars.get(position).getKilometrage());
    }

    @Override
    public int getItemCount() {
        return cars.size();


    }
}
