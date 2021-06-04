package com.hirumi.hirumiapps;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

// Nama: M Hilmy Naufal
// NIM: 10118046
// Kelas: IF-2
// Tanggal Pengerjaan: 05 Juni 2021

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> pertamaFragment = new ArrayList<>();

    private final List<String> pertamaTitle =  new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return pertamaFragment.get(position);
    }

    @Override
    public int getCount() {
        return pertamaTitle.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return pertamaTitle.get(position);
    }



    public void AddFragment (Fragment fragment,String title){
        pertamaFragment.add(fragment);
        pertamaTitle.add(title);
    }
}
