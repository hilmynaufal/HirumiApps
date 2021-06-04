package com.hirumi.hirumiapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hirumi.hirumiapps.View.OnboardFirstFragment;
import com.hirumi.hirumiapps.View.OnboardSecondFragment;
import com.hirumi.hirumiapps.View.OnboardThirdFragment;
import com.hirumi.hirumiapps.View.SplashScreen;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

// Nama: M Hilmy Naufal
// NIM: 10118046
// Kelas: IF-2
// Tanggal Pengerjaan: 05 Juni 2021

public class OnboardingActivity extends AppCompatActivity {

    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    DotsIndicator dotsIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        viewPager = (ViewPager) findViewById(R.id.viewpager_onboard);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.AddFragment(new OnboardFirstFragment(), "First");
        viewPagerAdapter.AddFragment(new OnboardSecondFragment(), "Second");
        viewPagerAdapter.AddFragment(new OnboardThirdFragment(), "Third");

        viewPager.setAdapter(viewPagerAdapter);

        dotsIndicator = (DotsIndicator) findViewById(R.id.dots_indicator);
        dotsIndicator.setViewPager(viewPager);
    }

    public void firstNext(View view) {
        viewPager.setCurrentItem(1);
    }

    public void secondNext(View view) {
        viewPager.setCurrentItem(2);
    }

    public void firstPrevious(View view) {
        viewPager.setCurrentItem(0);
    }

    public void finishLine(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}