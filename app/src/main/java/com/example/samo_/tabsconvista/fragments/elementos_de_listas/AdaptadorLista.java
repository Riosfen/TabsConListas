package com.example.samo_.tabsconvista.fragments.elementos_de_listas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.samo_.tabsconvista.R;

/**
 * Created by samo_ on 23/01/2017.
 */
public class AdaptadorLista extends BaseAdapter {
    private LayoutInflater inflador;
    private Context contexto;
    private ListaPersonas listaPersonas;

    //Componentes de la lista
    private TextView nombre, telefono, correo;
    private ImageButton favorito;
    private ImageView imagen;

    public AdaptadorLista(Context contexto, ListaPersonas listaPersonas){
        this.contexto = contexto;
        this.listaPersonas = listaPersonas;
        this.inflador = (LayoutInflater) contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Persona p = listaPersonas.getPersona(position);

        if(convertView == null){
            convertView = inflador.inflate(R.layout.fragmentlistagenda, null);
        }

        nombre = (TextView) convertView.findViewById(R.id.nombre);
        nombre.setText(p.getNombre());
        telefono = (TextView) convertView.findViewById(R.id.telefono);
        telefono.setText(p.getTelefono());
        correo = (TextView) convertView.findViewById(R.id.correo);
        correo.setText(p.getCorreo());

        favorito = (ImageButton) convertView.findViewById(R.id.favorito);
        if(p.isFavorito()){
            favorito.setImageResource(R.drawable.favorito);
        }else{
            favorito.setImageResource(R.drawable.nofavorito);
        }
        favorito.setScaleType(ImageView.ScaleType.FIT_END);

        imagen = (ImageView) convertView.findViewById(R.id.imagen);
        if(p.getGenero() == Genero.HOMBRE.HOMBRE){
            imagen.setImageResource(R.drawable.hombre);
        }else{
            imagen.setImageResource(R.drawable.mujer);
        }
        imagen.setScaleType(ImageView.ScaleType.FIT_END);

        return convertView;
    }

    @Override
    public int getCount() {
        return listaPersonas.getTamanio();
    }

    @Override
    public Object getItem(int position) {
        return listaPersonas.getPersona(position);
    }

    @Override
    public long getItemId(int position) {
        //TODO esto debe ser 0 siempre, sino provoca un bucle infinito (Overflow)
        return 0;
    }
}

