package com.devf.devffragmentssample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p/>
 * Created by Pedro Hernández on 09/2015.
 */

public class MiPrimerFragmento extends Fragment{

    Button botonPikachu, botonSquirtle, botonCharizard;
    PokemonClickeado escuchadorDeClicksEnPokemon;

    Pokemon[] pokemones;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_primer, container, false);

        botonPikachu = (Button) view.findViewById(R.id.boton_pikachu);
        botonSquirtle = (Button) view.findViewById(R.id.boton_squirtle);
        botonCharizard = (Button) view.findViewById(R.id.boton_charizard);

        escuchadorDeClicksEnPokemon = (MainActivity)getActivity();
        pokemones = crearPokemones();

        botonPikachu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                escuchadorDeClicksEnPokemon.onClick(pokemones[0]);
            }
        });

        botonSquirtle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                escuchadorDeClicksEnPokemon.onClick(pokemones[1]);
            }
        });

        botonCharizard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                escuchadorDeClicksEnPokemon.onClick(pokemones[2]);
            }
        });


        return view;
    }

    public Pokemon[] crearPokemones(){
        Pokemon pikachu = new Pokemon("Pikachu", 70, 60);
        Pokemon squirtle = new Pokemon("Squirtle", 90, 110);
        Pokemon charizard = new Pokemon("Charizard", 200, 150);

        return new Pokemon[] {pikachu, squirtle, charizard};
    }

}
