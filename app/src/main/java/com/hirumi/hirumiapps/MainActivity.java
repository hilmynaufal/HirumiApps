package com.hirumi.hirumiapps;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.hirumi.hirumiapps.View.DailyFragment;
import com.hirumi.hirumiapps.View.GalleryFragment;
import com.hirumi.hirumiapps.View.HomeFragment;
import com.hirumi.hirumiapps.View.MusicVideoFragment;
import com.hirumi.hirumiapps.View.ProfileFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(new HomeFragment());

        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment (Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
        }
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.homeMenu:
                fragment = new HomeFragment();
                break;
            case R.id.dailyMenu:
                fragment = new DailyFragment();
                break;
            case R.id.galleryMenu:
                fragment = new GalleryFragment();
                break;
            case R.id.musicVideoMenu:
                fragment = new MusicVideoFragment();
                break;
            case R.id.profileMenu:
                fragment = new ProfileFragment();
                break;
        }
        return loadFragment(fragment);
    }
}