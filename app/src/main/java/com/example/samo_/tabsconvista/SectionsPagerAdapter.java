package com.example.samo_.tabsconvista;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.samo_.tabsconvista.fragments.FragmentAlarma;
import com.example.samo_.tabsconvista.fragments.FragmentGustos;
import com.example.samo_.tabsconvista.fragments.FragmentListAgenda;
import com.example.samo_.tabsconvista.fragments.FragmentPaginaWeb;

/**
 * Created by samo_ on 23/01/2017.
 */

// improtar los metodos y modificarlos

public class SectionsPagerAdapter extends FragmentPagerAdapter {
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new FragmentPaginaWeb();
            case 1:
                return new FragmentGustos();
            case 2:
                return new FragmentAlarma();
            case 3:
                return new FragmentListAgenda();
            case 4:
                return new FragmentPaginaWeb();
            case 5:
                return new FragmentGustos();
            case 6:
                return new FragmentAlarma();
            case 7:
                return new FragmentListAgenda();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 8;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "Web";
            case 1:
                return "Gustos";
            case 2:
                return "Alarma";
            case 3:
                return "Agenda";
            case 4:
                return "Web";
            case 5:
                return "Gustos";
            case 6:
                return "Alarma";
            case 7:
                return "Agenda";
        }

        return null;
    }
}
