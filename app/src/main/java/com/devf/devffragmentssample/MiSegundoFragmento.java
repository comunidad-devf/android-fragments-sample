package com.devf.devffragmentssample;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

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
public class MiSegundoFragmento extends Fragment {

    TextView nombre, ataque, defensa;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vistaFragmento = inflater.inflate(R.layout.fragment_segundo, container, false);

        nombre = (TextView) vistaFragmento.findViewById(R.id.text_nombre);
        ataque = (TextView) vistaFragmento.findViewById(R.id.text_ataque);
        defensa = (TextView) vistaFragmento.findViewById(R.id.text_defensa);

        return vistaFragmento;
    }

    public void setPokemon(Pokemon pokemon){
        nombre.setText(pokemon.getNombre());
        ataque.setText(pokemon.getAtaque() + "");
        defensa.setText(pokemon.getDefensa() + "");
    }
}
