package com.example.lat3;


import android.content.Intent;
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
public class ContactFragment extends Fragment {
    private Button back;
    private Button tlp;
    private Button email;
    private Button instagram;
    private Button facebook;
    private Button twitter;
    private Button rock;
    public ContactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        back = (Button) view.findViewById(R.id.button12);
        tlp = (Button) view.findViewById(R.id.button13);
        email = (Button) view.findViewById(R.id.button15);
        instagram = (Button) view.findViewById(R.id.button16);
        facebook = (Button) view.findViewById(R.id.button17);
        twitter = (Button) view.findViewById(R.id.button18);
        rock = (Button) view.findViewById(R.id.button19);
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
        tlp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + "082119930004"));
                callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getActivity().startActivity(callIntent);
            }
        });
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.setType("message/rfc822");
                email.putExtra(email.EXTRA_EMAIL, new String[]{"Hafizhbudiman15@gmail.com"});
                getActivity().startActivity(Intent.createChooser(email, "Pilih Aplikasi Email"));
            }
        });
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent instagram = new Intent(Intent.ACTION_VIEW);
                instagram.setData(Uri.parse("https://www.instagram.com/hafizhbd/"));
                getActivity().startActivity(instagram);
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebook = new Intent(Intent.ACTION_VIEW);
                facebook.setData(Uri.parse("https://www.facebook.com/Hafizh7x"));
                getActivity().startActivity(facebook);
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twitter = new Intent(Intent.ACTION_VIEW);
                twitter.setData(Uri.parse("https://twitter.com/hafizh_V"));
                getActivity().startActivity(twitter);
            }
        });
        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rock = new Intent(Intent.ACTION_VIEW);
                rock.setData(Uri.parse("https://socialclub.rockstargames.com/member/hafizh7xx/"));
                getActivity().startActivity(rock);
            }
        });
    }
}