package com.hirumi.hirumiapps.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.room.Room;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.hirumi.hirumiapps.R;
import com.hirumi.hirumiapps.Room.Database;
import com.hirumi.hirumiapps.Room.Entity.Daily;
import com.hirumi.hirumiapps.ViewPagerAdapter;

import java.util.List;

// Nama: M Hilmy Naufal
// NIM: 10118046
// Kelas: IF-2
// Tanggal Pengerjaan: 05 Juni 2021

public class DailyFragment extends Fragment implements View.OnClickListener {

    public static Database database;
    private Button adddata, readdata, deletedata, updatedata;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_daily, container, false);

        database = Room.databaseBuilder(getContext().getApplicationContext(), Database.class, "infodb").allowMainThreadQueries().build();

//        adddata = (Button) view.findViewById(R.id.button_add);
//        readdata = (Button) view.findViewById(R.id.button_read);
//        deletedata = (Button) view.findViewById(R.id.button_delete);
//        updatedata = (Button) view.findViewById(R.id.button_update);
//
//        adddata.setOnClickListener(this);
//        readdata.setOnClickListener(this);
//        deletedata.setOnClickListener(this);
//        updatedata.setOnClickListener(this);

        tabLayout = (TabLayout) view.findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager_id);
        viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());

        viewPagerAdapter.AddFragment(new ActivitesFragment(), "Activities");
        viewPagerAdapter.AddFragment(new FriendsFragment(), "Friends");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

//        switch (id) {
//            case R.id.button_add: {
//                Daily daily = new Daily();
//                daily.setNamaAktifitas("makan");
//                daily.setWaktuAktifitas("jam 9");
//
//                database.dailyDAO().save(daily);
//                break;
//            }
//            case R.id.button_read: {
//                List<Daily> dailies = database.dailyDAO().findAll();
//                Toast.makeText(getContext(), dailies.get(0).getNamaAktifitas(), Toast.LENGTH_LONG).show();
//                break;
//            }
//        }
    }
}
