package com.hirumi.hirumiapps;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.room.Room;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.hirumi.hirumiapps.Room.Database;
import com.hirumi.hirumiapps.Room.Entity.Daily;
import com.hirumi.hirumiapps.View.DailyFragment;
import com.hirumi.hirumiapps.View.GalleryFragment;
import com.hirumi.hirumiapps.View.HomeFragment;
import com.hirumi.hirumiapps.View.MusicVideoFragment;
import com.hirumi.hirumiapps.View.ProfileFragment;

// Nama: M Hilmy Naufal
// NIM: 10118046
// Kelas: IF-2
// Tanggal Pengerjaan: 05 Juni 2021
public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    public static Database database;

    //    private static String API_KEY = "AIzaSyAbkEEkTefVoS1FckBNYdOelklwghIINqM";
//    YouTubePlayerFragment youTubePlayerFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //room init
        database = Room.databaseBuilder(getApplicationContext(), Database.class, "daily").allowMainThreadQueries().build();

        if (database.dailyDAO().size() == 0) {
            Log.d("test", "nodata");

            database.dailyDAO().save(new Daily(R.drawable.alarm, "Bangun Tidur", "07.00", "1 Jam"));
            database.dailyDAO().save(new Daily(R.drawable.food, "Sarapan", "08.00", "1 Jam"));
            database.dailyDAO().save(new Daily(R.drawable.book, "Kuliah", "09.00", "4 Jam"));
            database.dailyDAO().save(new Daily(R.drawable.food, "Makan Siang", "13.00", "1 Jam"));
            database.dailyDAO().save(new Daily(R.drawable.shuttlecock, "Olahraga", "16.00", "2 Jam"));
            database.dailyDAO().save(new Daily(R.drawable.food, "Makan Malam", "20.00", "1 Jam"));
            database.dailyDAO().save(new Daily(R.drawable.game, "Gaming & Ber-internet", "21.00", "3 Jam"));
            database.dailyDAO().save(new Daily(R.drawable.alarm, "Tidur", "00.00", "7 Jam"));
        }


        loadFragment(new HomeFragment());

        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
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