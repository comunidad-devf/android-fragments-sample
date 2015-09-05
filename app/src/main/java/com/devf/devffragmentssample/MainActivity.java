package com.devf.devffragmentssample;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manejador = getSupportFragmentManager();

        FragmentTransaction transaccion = manejador.beginTransaction();
        MiSegundoFragmento segundoFragmento = new MiSegundoFragmento();

        transaccion.add(R.id.contedor_fragmentos, segundoFragmento);
        transaccion.commit();

    }

}