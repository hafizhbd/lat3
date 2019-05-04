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

public class ModelKontak {

    private String namaorang;

    public ModelKontak(String namaorang) {
        this.namaorang = namaorang;
    }

    public void setNamaorang(String namaorang) {
        this.namaorang = namaorang;
    }

    public String getnamaorang() {
        return namaorang;
    }
}
