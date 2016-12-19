package com.android.curso.logotipo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MascotasFragment extends Fragment {

    public static ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    public MascotaAdaptador adaptador;

    public MascotasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_mascotas, container, false);

        listaMascotas = (RecyclerView)v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();



        return v;
    }

    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Ardillita", 0, R.drawable.ardilla));
        mascotas.add(new Mascota("Dino",      0, R.drawable.dino));
        mascotas.add(new Mascota("Garfield",  0, R.drawable.garfield));
        mascotas.add(new Mascota("Gata",      0, R.drawable.gata));
        mascotas.add(new Mascota("Gato",      0, R.drawable.gato));
        mascotas.add(new Mascota("Odi",       0, R.drawable.odi));
        mascotas.add(new Mascota("Pluto",     0, R.drawable.pluto));

    }




}
