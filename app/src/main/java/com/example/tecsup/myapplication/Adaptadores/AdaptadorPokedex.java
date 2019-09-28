package com.example.tecsup.myapplication.Adaptadores;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tecsup.myapplication.Pokemon;

import java.util.List;

public class AdaptadorPokedex extends RecyclerView.Adapter<Pokedexholder> {
    Context context;
    int layout;
    List<Pokemon>datos;
    LayoutInflater layoutInflater;

    public AdaptadorPokedex(Context context, int layout, List<Pokemon> datos) {
        this.context = context;
        this.layout = layout;
        this.datos = datos;
        this.layoutInflater = layoutInflater.from(context);
    }

    @NonNull
    @Override
    public Pokedexholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=layoutInflater.inflate(layout,parent,false);
        return new Pokedexholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Pokedexholder holder, int position) {
        holder.nombrePokemon.setText(datos.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return datos.size();
    }


}
