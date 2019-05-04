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
public class MusicFragment extends Fragment {
    private Button mf;
    private Button vf;

    public static MusicFragment newInstance() {
        // Required empty public constructor
        return new MusicFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_music, container, false);
        mf = (Button) view.findViewById(R.id.button4);
        vf = (Button) view.findViewById(R.id.button6);
        return view;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Music1Fragment music1Fragment = new Music1Fragment();

                getFragmentManager().beginTransaction().replace(R.id.main_frame, music1Fragment)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
            }
        });
        vf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoFragment videoFragment = new VideoFragment();
                getFragmentManager().beginTransaction().replace(R.id.main_frame, videoFragment)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();

            }
        });
    }
}
