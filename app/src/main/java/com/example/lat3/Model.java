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

public class Model {

    private String aktifitas;
    private String kegiatan;
    private String kerjakan;

    public Model (String aktifitas, String kegiatan, String kerjakan) {
        this.aktifitas = aktifitas;
        this.kegiatan = kegiatan;
        this.kerjakan = kerjakan;

    }

    public String getAktifitas() {
        return aktifitas;
    }

    public void setAktifitas(String aktifitas) {
        this.aktifitas = aktifitas;
    }

    public String getKegiatan() {
        return kegiatan;
    }

    public void setKegiatan(String kegiatan) {
        this.kegiatan = kegiatan;
    }

    public String getKerjakan() {
        return kerjakan;
    }

    public void setKerjakan(String kerjakan) {
        this.kerjakan = kerjakan;
    }
}
