package com.example.lat3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
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

/*
Aplikasi v0.0.1
Tanggal 25 April 2019 13.21
1. Membuat Tampilan Splash Screen
2. Membuat Intent kehalaman WalkthroughActivity

Aplikasi v0.0.2
Tanggal 30 April 2019 20.06
1. Membuat Tampilan Walkthrough (ViewPager)
 */
public class SplashScreenActivity extends AppCompatActivity {
    private int waktu_loading=3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent menu =new Intent(SplashScreenActivity.this, WalkthroughActivity.class);
                startActivity(menu);
                finish();

            }
        },waktu_loading);
    }
}