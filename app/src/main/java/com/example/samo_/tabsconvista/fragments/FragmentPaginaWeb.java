package com.example.samo_.tabsconvista.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.samo_.tabsconvista.R;

/**
 * Created by samo_ on 23/01/2017.
 */
public class FragmentPaginaWeb extends Fragment {
    private EditText editWeb;
    private Button btnWeb;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_pagina_web, container, false);

        editWeb = (EditText) v.findViewById(R.id.editWeb);
        btnWeb = (Button) v.findViewById(R.id.btnWeb);

        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://" + editWeb.getText()));
                startActivity(intent);
            }
        });

        return v;
    }

}
