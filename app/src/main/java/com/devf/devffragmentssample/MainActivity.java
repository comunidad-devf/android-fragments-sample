package com.devf.devffragmentssample;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements PokemonClickeado{

    public static final String LOG_TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    private boolean estaElSegundoFragmentoVisible() {
       return getSupportFragmentManager().findFragmentById(R.id.fragment_segundo) != null;
    }

    @Override
    public void onClick(Pokemon pokemon) {

        if (estaElSegundoFragmentoVisible()) {
            MiSegundoFragmento segundoFragmento = (MiSegundoFragmento) getSupportFragmentManager()
                    .findFragmentById(R.id.fragment_segundo);

            segundoFragmento.setPokemon(pokemon);
        }

        else {
            Intent segundaActividad = new Intent(this, SecondActivity.class);
            segundaActividad.putExtra("nombre", pokemon.getNombre());
            segundaActividad.putExtra("ataque", pokemon.getAtaque());
            segundaActividad.putExtra("defensa", pokemon.getDefensa());

            startActivity(segundaActividad);
        }
    }
}
