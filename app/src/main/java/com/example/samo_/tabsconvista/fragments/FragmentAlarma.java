package com.example.samo_.tabsconvista.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.samo_.tabsconvista.R;

/**
 * Created by samo_ on 23/01/2017.
 */
public class FragmentAlarma extends Fragment {
    private EditText editHora, editMinuto;
    private Button btnAlarma;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_alarma, container, false);

        editHora = (EditText) v.findViewById(R.id.editHora);
        editMinuto = (EditText) v.findViewById(R.id.editMinuto);
        btnAlarma = (Button) v.findViewById(R.id.btnAlarma);

        btnAlarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Integer.parseInt(editHora.getText().toString()) > 23 ||Integer.parseInt(editHora.getText().toString())  < 0){
                    Toast.makeText(getContext(), "Hora incorrecta", Toast.LENGTH_SHORT).show();
                }else {
                    if(Integer.parseInt(editMinuto.getText().toString()) > 59 ||Integer.parseInt(editMinuto.getText().toString())  < 0){
                        Toast.makeText(getContext(), "Minuto incorrecto", Toast.LENGTH_SHORT).show();
                    }else{
                        String hora = editHora.getText().toString();
                        String minuto = editMinuto.getText().toString();
                        Toast.makeText(getContext(), "La alarma sonará a las " + hora + " horas y " + minuto + " minutos.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        return v;
    }

}
