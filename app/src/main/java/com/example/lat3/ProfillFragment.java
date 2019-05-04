package com.example.lat3;


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
public class ProfillFragment extends Fragment {
    private Button profil;
    private Button contact;
    private Button find;
    private Button about;

    public static ProfillFragment newInstance() {
        // Required empty public constructor
        return new ProfillFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profill, container, false);
        profil = (Button) view.findViewById(R.id.button8);
        contact = (Button) view.findViewById(R.id.button9);
        find = (Button) view.findViewById(R.id.button10);
        about = (Button) view.findViewById(R.id.button11);
        return view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Profil1Fragment profil1Fragment = new Profil1Fragment();

                getFragmentManager().beginTransaction().replace(R.id.main_frame, profil1Fragment)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContactFragment contactFragment = new ContactFragment();

                getFragmentManager().beginTransaction().replace(R.id.main_frame, contactFragment)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
            }
        });
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FindFragment findFragment = new FindFragment();

                getFragmentManager().beginTransaction().replace(R.id.main_frame, findFragment)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AboutFragment aboutFragment = new AboutFragment();

                getFragmentManager().beginTransaction().replace(R.id.main_frame, aboutFragment)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
            }
        });
    }
}
