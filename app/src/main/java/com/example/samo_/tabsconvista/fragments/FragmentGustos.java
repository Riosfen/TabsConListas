package com.example.samo_.tabsconvista.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.samo_.tabsconvista.R;

/**
 * Created by samo_ on 23/01/2017.
 */
public class FragmentGustos extends Fragment {
    private RadioGroup grupo;
    private RadioButton rdbMujer, rdbHombre;
    private CheckBox chkOpt1, chkOpt2, chkOpt3, chkOpt4;
    private Button btnGustos;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_gustos, container, false);

        grupo = (RadioGroup) v.findViewById(R.id.grupo);
        rdbHombre = (RadioButton) v.findViewById(R.id.rdbHombre);
        rdbMujer = (RadioButton) v.findViewById(R.id.rdbMujer);
        chkOpt1 = (CheckBox) v.findViewById(R.id.chkOpcion1);
        chkOpt2 = (CheckBox) v.findViewById(R.id.chkOpcion2);
        chkOpt3 = (CheckBox) v.findViewById(R.id.chkOpcion3);
        chkOpt4 = (CheckBox) v.findViewById(R.id.chkOpcion4);
        btnGustos = (Button) v.findViewById(R.id.btnGustos);

        btnGustos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int contCheck = 0;
                StringBuilder builder = new StringBuilder("");
                StringBuilder gustos = new StringBuilder("");

                if(rdbHombre.isChecked()){
                    builder.append("Al Hombre");
                }else{
                    builder.append("A la Mujer");
                }

                if(chkOpt1.isChecked()) {
                    gustos.append(chkOpt1.getText().toString() + ", ");
                    contCheck++;
                }
                if(chkOpt2.isChecked()) {
                    gustos.append(chkOpt2.getText().toString() + ", ");
                    contCheck++;
                }
                if(chkOpt3.isChecked()){
                    gustos.append(chkOpt3.getText().toString() + ", ");
                    contCheck++;
                }
                if(chkOpt4.isChecked()){
                    gustos.append(chkOpt4.getText().toString());
                    contCheck++;
                }

                String cadena;
                if(contCheck > 0) {
                    cadena = builder.append(", le gusta " + gustos).toString();
                }else{
                    cadena = builder.append(", no le gusta nada.").toString();
                }
                Toast.makeText(getContext(), cadena, Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }

}
