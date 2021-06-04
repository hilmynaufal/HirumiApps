package com.hirumi.hirumiapps.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.hirumi.hirumiapps.MainActivity;
import com.hirumi.hirumiapps.OnboardingActivity;
import com.hirumi.hirumiapps.R;

// Nama: M Hilmy Naufal
// NIM: 10118046
// Kelas: IF-2
// Tanggal Pengerjaan: 05 Juni 2021

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, OnboardingActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}