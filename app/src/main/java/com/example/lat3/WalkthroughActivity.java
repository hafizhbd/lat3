package com.example.lat3;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;/*/
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


public class WalkthroughActivity extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotsLayout;
    private SliderAdapter sliderAdapter;
    private TextView[] mDots;
    private Button mNextBtn;
    private Button mBackBtn;
    private Button mfinishbtn;
    private int mCurrentPage;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
        mDotsLayout = (LinearLayout) findViewById(R.id.dotsLayout);
        mNextBtn = (Button) findViewById(R.id.button2);
        mBackBtn = (Button) findViewById(R.id.button);
        mfinishbtn = (Button) findViewById(R.id.button3);
        sliderAdapter = new SliderAdapter(this);
        mSlideViewPager.setAdapter(sliderAdapter);
        addDotsIndicator(0);
        mSlideViewPager.addOnPageChangeListener(viewListener);
        mNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSlideViewPager.setCurrentItem(mCurrentPage + 1);
            }
        });
        mBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSlideViewPager.setCurrentItem(mCurrentPage - 1);
            }
        });
    }
    public void mulai(View view){
        Intent intent = new Intent(WalkthroughActivity.this, MenuActivity.class);
        startActivity(intent);

    }
    public void addDotsIndicator(int position){

        mDots = new TextView[3];
        mDotsLayout.removeAllViews();

        for (int i = 0; i < mDots.length; i++){

            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.abu));
            mDotsLayout.addView(mDots[i]);
        }
        if(mDots.length > 0){
            mDots[position].setTextColor(getResources().getColor(R.color.putih));
        }

    }
    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);
            mCurrentPage = i;
            if (i == 0) {

                mNextBtn.setEnabled(true);
                mBackBtn.setEnabled(false);
                mfinishbtn.setEnabled(false);
                mNextBtn.setVisibility(View.VISIBLE);
                mBackBtn.setVisibility(View.INVISIBLE);
                mfinishbtn.setVisibility(View.INVISIBLE);

                mNextBtn.setText("Next");
                mBackBtn.setText("");
                mfinishbtn.setText("");
            } else if (i == mDots.length - 1) {

                mNextBtn.setEnabled(false);
                mBackBtn.setEnabled(true);
                mfinishbtn.setEnabled(true);
                mBackBtn.setVisibility(View.VISIBLE);
                mfinishbtn.setVisibility(View.VISIBLE);
                mNextBtn.setVisibility(View.INVISIBLE);

                mNextBtn.setText("");
                mBackBtn.setText("Back");
                mfinishbtn.setText("Finish");
            } else {
                mNextBtn.setEnabled(true);
                mfinishbtn.setEnabled(false);
                mBackBtn.setEnabled(true);
                mNextBtn.setVisibility(View.VISIBLE);
                mBackBtn.setVisibility(View.VISIBLE);
                mfinishbtn.setVisibility(View.INVISIBLE);

                mNextBtn.setText("Next");
                mfinishbtn.setText("");
                mBackBtn.setText("Back");
            }
            }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };


        }

