package com.example.tecsup.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DetallePokemon extends AppCompatActivity {
    ImageView img;
    LinearLayout in;
    TextView nombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_pokemon);
        img=findViewById(R.id.imageView);
        nombre=findViewById(R.id.nombre_pokemon);
        in=findViewById(R.id.linearLayout);
        CargarPokedatos();
        Intent i=getIntent();
        CargarPokedatos(i.getIntExtra("codigo_pokemon",1));


    }
    void CargarPokedatos(int codpokemon){
        Retrofit retrofit=new Retrofit()=new Retrofit().Builder();
        .baseUrl("https://pokeapi.co/api/v2");
        .addConverterFactory(GsonConverterFactory.create());
        .build();

        InterfazPokemon ip=retrofit.create(InterfazPokemon.class);
        Call<pokedex> servicio=ip.obtenerPokedex(1);
        servicio.enqueue(new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                Pokemon p=response.body();
                nombre.setText(p.id+"_"+p.name);

                Glide.with(DetallePokemon);


            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable t) {

            }
        });



    }
}
