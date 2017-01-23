package com.example.samo_.tabsconvista.fragments.elementos_de_listas;

import com.example.samo_.tabsconvista.R;
/**
 * Created by samo_ on 23/01/2017.
 */

public enum Genero {
    HOMBRE("hombre", R.drawable.hombre),
    MUJER("mujer", R.drawable.mujer);

    String tipo;
    int idImagen;

    Genero(String tipo, int idImagen) {
        this.tipo = tipo;
        this.idImagen = idImagen;
    }

    public String getTipo(){
        return this.tipo;
    }

    public int getId(){
        return this.idImagen;
    }
}
