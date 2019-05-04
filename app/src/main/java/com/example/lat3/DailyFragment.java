package com.example.lat3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
/*/
    AKB 2 10116060 Muhammad Hafizh Budiman
    Changelog
    Aplikasi V0.1 27 April 2019
    - Membuat Splash Screen
    - Membuat ViewPager Walkthrough
    Aplikasi V0.2 29 Mei 2019
    - Membuat Bottom Navigation Menu Utama
    - Membuat Fragment Semua Halaman untuk Menu Utama
    Aplikasi V0.3 1 Mei 2019
    - Membuat ActionView Social Media
    Aplikasi V0.4 4 Mei 2019
    - Membuat Recycler View Daily, Gallery
    - Membuat Menu Music
    - Menampilkan Maps
    - About Aplikasi
    - Menampilkan Video

 */


/**
 * A simple {@link Fragment} subclass.
 */
public class DailyFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView recyclerView1;
    private DataAdapter adapter;
    private KontakAdapter adapter1;

    private ArrayList<Model> model;
    private ArrayList<ModelKontak> model1;

    public static DailyFragment newInstance() {
        // Required empty public constructor
        return new DailyFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_daily, container, false);
        // Data Daily
        addData();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recylerdaily);
        adapter = new DataAdapter(model);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        // Data Kontak
        addDataKontak();
        RecyclerView recyclerView1 = (RecyclerView) view.findViewById(R.id.recylerfriend);
        adapter1 = new KontakAdapter(model1);
        if (recyclerView1!=null)
        {
            recyclerView1.setAdapter(adapter1);
            recyclerView1.setHasFixedSize(true);
            recyclerView1.setLayoutManager(new GridLayoutManager(getActivity(), 1));
        }


        return view;
    }

    void addData(){
        model = new ArrayList<>();
        model.add(new Model("Bangun Pagi","Berangkat Kuliah","Jam 7"));
        model.add(new Model("Pulang Kuliah","Pulang Ke Rumah","Jam 6"));
        model.add(new Model("Tidur","Memulai Untuk Tidur","Jam 12"));
    }

    void addDataKontak(){
        model1 = new ArrayList<>();
        model1.add(new ModelKontak("Ferdy"));
        model1.add(new ModelKontak("Eka"));
    }

}
