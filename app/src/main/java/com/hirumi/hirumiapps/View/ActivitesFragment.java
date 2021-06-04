package com.hirumi.hirumiapps.View;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hirumi.hirumiapps.AdapterTest;
import com.hirumi.hirumiapps.MainActivity;
import com.hirumi.hirumiapps.R;
import com.hirumi.hirumiapps.Room.Entity.Daily;

import java.util.List;

// Nama: M Hilmy Naufal
// NIM: 10118046
// Kelas: IF-2
// Tanggal Pengerjaan: 05 Juni 2021

public class ActivitesFragment extends Fragment {
    private RecyclerView recyclerView;
    View v;

    public ActivitesFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_activities, container, false);

        recyclerView = v.findViewById(R.id.rvDaily);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        getData();

        return v;
    }

    public void getData() {
        class GetData extends AsyncTask<Void, Void, List<Daily>> {

            @Override
            protected List<Daily> doInBackground(Void... voids) {
                List<Daily> daily = MainActivity.database.dailyDAO().findAll();
                return daily;
            }

            @Override
            protected void onPostExecute(List<Daily> dailies) {
                AdapterTest adapterTest = new AdapterTest(dailies);
                recyclerView.setAdapter(adapterTest);
                super.onPostExecute(dailies);
            }
        }

        GetData gd = new GetData();
        gd.execute();
    }
}
