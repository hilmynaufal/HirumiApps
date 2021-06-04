package com.hirumi.hirumiapps.View;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hirumi.hirumiapps.FriendAdapter;
import com.hirumi.hirumiapps.MusicAdapter;
import com.hirumi.hirumiapps.NonRoomEntity.Friend;
import com.hirumi.hirumiapps.NonRoomEntity.Music;
import com.hirumi.hirumiapps.R;

import java.util.ArrayList;
import java.util.List;

// Nama: M Hilmy Naufal
// NIM: 10118046
// Kelas: IF-2
// Tanggal Pengerjaan: 05 Juni 2021

public class MusicVideoFragment extends Fragment {

    private static String API_KEY = "AIzaSyAbkEEkTefVoS1FckBNYdOelklwghIINqM";
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music_video, container, false);

        recyclerView = view.findViewById(R.id.rvMusic);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));

        List<Music> musicList = new ArrayList<>();

        musicList.add(new Music("LcAem1j6TmY", "Ariabl'eyes - Asphodelos"));
        musicList.add(new Music("mH5HjmIsPp0", "Ariabl'eyes - 穢れなき薔薇十字"));
        musicList.add(new Music("9mj2QJE-UOI", "Akai Haato feat. Haachama - Infinity"));

        MusicAdapter musicAdapter = new MusicAdapter(musicList);
        recyclerView.setAdapter(musicAdapter);

        return view;
    }
}
