package com.example.tecsup.myapplication.Adaptadores;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.tecsup.myapplication.DetallePokemon;
import com.example.tecsup.myapplication.MainActivity;
import com.example.tecsup.myapplication.R;

public class Pokedexholder extends RecyclerView.ViewHolder {
    TextView nombrePokemon;
    CardView cv;
    Context context;

    public Pokedexholder(@NonNull View itemView,Context c){
        super(itemView);
        this.context=c;

        nombrePokemon=itemView.findViewById(R.id.recycler_view);
        cv=itemView.findViewById(R.id.card_view);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,DetallePokemon.class);
        context.startActivity(intent);
            }
        });


        }
    }

