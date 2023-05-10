package com.example.foodrecipeapp.Adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodrecipeapp.R;

public class RandomRecipeAdapter {
}
class RandomRecipeViewHolder extends RecyclerView.ViewHolder{
    CardView random_list_container;
    TextView textView_title, textView_servings, textView_likes, textView_time;
    ImageView imageView_food;
    public RandomRecipeViewHolder(@NonNull View itemView){
        super(itemView);


        random_list_container = itemView.findViewById(R.id.random_list_container);
        textView_title = itemView.findViewById(R.id.textView_title);
        textView_servings = itemView.findViewById(R.id.textView_servings);
        textView_likes = itemView.findViewById(R.id.textView_likes);
        textView_time = itemView.findViewById(R.id.textView_time);
    }
}