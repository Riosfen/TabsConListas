package com.example.samo_.tabsconvista.fragments.elementos_de_listas;

import java.util.ArrayList;

/**
 * Created by samo_ on 23/01/2017.
 */
public class ListaPersonas {
    private ArrayList<Persona> listaPersonas;

    public ListaPersonas(){
        listaPersonas = new ArrayList<Persona>();
    }

    public void addPersona(Persona persona){
        this.listaPersonas.add(persona);
    }

    public int getTamanio(){
        return this.listaPersonas.size();
    }

    public Persona getPersona(int posicion){
        return this.listaPersonas.get(posicion);
    }
}
