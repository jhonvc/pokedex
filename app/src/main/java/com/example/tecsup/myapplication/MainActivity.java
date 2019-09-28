package com.example.tecsup.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.tecsup.myapplication.Adaptadores.AdaptadorPokedex;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        CargarPokedex();
    }
    void CargarPokedex(){


        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        InterfazPokemon ip = retrofit.create(InterfazPokemon.class);
        Call<pokedex> servicio = ip.obtenerPokedex(151);
        servicio.enqueue(new Callback<pokedex>() {
            @Override
            public void onResponse(Call<pokedex> call, Response<pokedex> response) {
                switch (response.code()){
                    case 200:


                        pokedex pokedex=response.body();
                        AdaptadorPokedex adaptadorPokedex=new AdaptadorPokedex
                                (MainActivity.this,R.layout.item_pokedez,pokedex.results);
                        recyclerView.setAdapter(adaptadorPokedex);
                        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                        break;

                        }
;           }

            @Override
            public void onFailure(Call<pokedex> call, Throwable t) {

            }
        });
    }
}
