package com.devf.devffragmentssample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String nombre = getIntent().getStringExtra("nombre");
        int ataque = getIntent().getIntExtra("ataque", 0);
        int defensa = getIntent().getIntExtra("defensa", 0);

        Pokemon pokemon = new Pokemon(nombre, ataque, defensa);

        MiSegundoFragmento segundoFragmento = (MiSegundoFragmento) getSupportFragmentManager()
                .findFragmentById(R.id.fragment_segundo);

        segundoFragmento.setPokemon(pokemon);
    }

}
