package com.devf.devffragmentssample;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

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

    LinearLayout contenedor;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View vistaFragmento = inflater.inflate(R.layout.fragment_segundo, container, false);

        Context actividad = getActivity();

        //Creando un botón
        Button botonFragmento = new Button(actividad);

        LinearLayout.LayoutParams parametros = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);


        //Configurar el botón
        botonFragmento.setText("Botón");
        botonFragmento.setLayoutParams(parametros);

        //Recuperando el contenedor
        contenedor = (LinearLayout) vistaFragmento.findViewById(R.id.contenedor_segundo_fragmento);

        //Añadir botón
        contenedor.addView(botonFragmento);

        return vistaFragmento;
    }
}
