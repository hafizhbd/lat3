package com.example.lat3;
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


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;


/**
 * A simple {@link Fragment} subclass.
 */
public class FindFragment extends Fragment {
    private Button back;
    private Button find;

    public FindFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_find, container, false);
        back = (Button) view.findViewById(R.id.button);
        find = (Button) view.findViewById(R.id.button14);
        return view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProfillFragment profillFragment = new ProfillFragment();

                getFragmentManager().beginTransaction().replace(R.id.main_frame, profillFragment)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
            }
        });
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent instagram = new Intent(Intent.ACTION_VIEW);
                instagram.setData(Uri.parse("https://www.google.com/maps/place/Jl.+Pratista+Utara+II,+Antapani+Kidul,+Antapani,+Kota+Bandung,+Jawa+Barat+40291/@-6.9253627,107.6619077,18z/data=!3m1!4b1!4m5!3m4!1s0x2e68e7fddfa375dd:0x27f8671ece48b18d!8m2!3d-6.9253654!4d107.663002"));
                getActivity().startActivity(instagram);
            }
        });
    }
}
