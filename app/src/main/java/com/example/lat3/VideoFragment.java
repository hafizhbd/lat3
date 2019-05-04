package com.example.lat3;


import android.net.Uri;
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
public class VideoFragment extends Fragment {
    private Button back;
    private Button she;
    private Button jump;

    public VideoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_video, container, false);
        back = (Button) view.findViewById(R.id.button);
        she = (Button) view.findViewById(R.id.button5);
        jump = (Button) view.findViewById(R.id.button7);
        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MusicFragment musicFragment = new MusicFragment();

                getFragmentManager().beginTransaction().replace(R.id.main_frame, musicFragment)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
            }
        });
        she.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video1Fragment video1Fragment = new Video1Fragment();

                getFragmentManager().beginTransaction().replace(R.id.main_frame, video1Fragment)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
            }
        });
        jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Video2Fragment video2Fragment = new Video2Fragment();

                getFragmentManager().beginTransaction().replace(R.id.main_frame, video2Fragment)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
            }
        });
    }
}
