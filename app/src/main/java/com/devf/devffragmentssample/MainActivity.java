package com.devf.devffragmentssample;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String LOG_TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    @Override
    public void onClick(View view) {
        Log.d(LOG_TAG, "El botón del fragmento fué clickeado");

        if (estaElSegundoFragmentoVisible()){
            cambiaDeColor();
        }

        else{
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }


    }

    private void cambiaDeColor() {
        MiSegundoFragmento segundoFragmento = (MiSegundoFragmento) getSupportFragmentManager()
                .findFragmentById(R.id.fragment_segundo);

        segundoFragmento.setColor(Color.WHITE);
    }

    private boolean estaElSegundoFragmentoVisible() {
       return getSupportFragmentManager().findFragmentById(R.id.fragment_segundo) != null;
    }
}
