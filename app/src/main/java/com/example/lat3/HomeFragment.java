package com.example.lat3;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
public class HomeFragment extends Fragment {

    private Button profil;
    private Button interest;

    public static HomeFragment newInstance() {
        // Required empty public constructor
        return new HomeFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        profil = (Button) view.findViewById(R.id.button4);
        interest = (Button) view.findViewById(R.id.button6);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProfilFragment profilFragment = new ProfilFragment();

                getFragmentManager().beginTransaction().replace(R.id.main_frame, profilFragment)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
            }
        });

        interest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InterestFragment interestFragment = new InterestFragment();

                getFragmentManager().beginTransaction().replace(R.id.main_frame, interestFragment)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
            }
        });
    }
}