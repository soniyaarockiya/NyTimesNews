package com.example.a91user.nytimesnews;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    Context context;
    List<Results> results;


    public RecyclerViewAdapter(Context context, List<Results> results) {
        this.context = context;
        this.results = results;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.item_cardview, viewGroup, false);
        MyViewHolder vHolder = new MyViewHolder(view);
        return vHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.Title.setText(results.get(i).getTitle());
        myViewHolder.Description.setText(results.get(i).getDescription());
        //myViewHolder.URL.setText(results.get(i).getUrl());

        //TODO: insert loop to choose image from multimediaList
        Glide.with(context).load(results.get(i).getMultimediaList().get(2).getUrl()).into(myViewHolder.Image); // glide statement


    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView Description;
        private TextView Title;
        private TextView URL;
        private ImageView Image;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Title = itemView.findViewById(R.id.title_world);
            Description = itemView.findViewById(R.id.description_world);
            //URL = itemView.findViewById(R.id.url_world);
            Image = itemView.findViewById(R.id.img_world);


        }
    }

}
