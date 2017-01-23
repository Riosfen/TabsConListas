package com.example.samo_.tabsconvista.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.samo_.tabsconvista.fragments.elementos_de_listas.AdaptadorLista;
import com.example.samo_.tabsconvista.fragments.elementos_de_listas.Genero;
import com.example.samo_.tabsconvista.fragments.elementos_de_listas.ListaPersonas;
import com.example.samo_.tabsconvista.R;
import com.example.samo_.tabsconvista.fragments.elementos_de_listas.Persona;

/**
 * Created by samo_ on 23/01/2017.
 */
public class FragmentListAgenda extends ListFragment {
    private ListaPersonas listaPersonas;
    private AdaptadorLista adaptador;
    private ListView lista;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lista, container, false);

        lista = (ListView) view.findViewById(R.id.lista);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        listaPersonas = new ListaPersonas();

        listaPersonas.addPersona(new Persona("Juan","666333222", "juan.triguero.gonzalez@gmail.com", true, Genero.HOMBRE));
        listaPersonas.addPersona(new Persona("Itxi", "666555444", "itxibehappy@gmail.com", true, Genero.MUJER));
        listaPersonas.addPersona(new Persona("Miguel", "654669332", "miguel@gmail.com", false, Genero.HOMBRE));
        listaPersonas.addPersona(new Persona("Anamari", "654987621", "anamaria.bravo@gmail.com", true, Genero.MUJER));
        listaPersonas.addPersona(new Persona("Dolores", "635555888", "dolores.gonzalez@gmail.com", true, Genero.MUJER));
        listaPersonas.addPersona(new Persona("Pocajonta", "631632633", "allaodelarrollo@gmail.com", false, Genero.MUJER));
        listaPersonas.addPersona(new Persona("Homer", "666555555", "amanteRechoncho@ol.com", true, Genero.HOMBRE));
        listaPersonas.addPersona(new Persona("Juanma", "636363951", "juanma@gmail.com", false, Genero.HOMBRE));
        listaPersonas.addPersona(new Persona("Juan", "654985852", "juan.triguero.garrido@gmail.com", true, Genero.HOMBRE));

        adaptador = new AdaptadorLista(getActivity().getApplicationContext(), listaPersonas);
        setListAdapter(adaptador);

    }
}

