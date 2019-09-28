package com.example.tecsup.myapplication;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface InterfazPokemon {
    @GET("pokemon/?limit=151")
    Call<pokedex> obtenerPokedex(@Query("limit") int cantidad);
    @GET("pokemon/{codigo}/")
    Call<Pokemon>

    }


