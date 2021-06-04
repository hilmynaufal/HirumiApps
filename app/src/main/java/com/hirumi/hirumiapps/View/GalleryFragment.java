package com.hirumi.hirumiapps.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hirumi.hirumiapps.GalleryAdapter;
import com.hirumi.hirumiapps.MusicAdapter;
import com.hirumi.hirumiapps.NonRoomEntity.Music;
import com.hirumi.hirumiapps.NonRoomEntity.Picture;
import com.hirumi.hirumiapps.R;

import java.util.ArrayList;
import java.util.List;

// Nama: M Hilmy Naufal
// NIM: 10118046
// Kelas: IF-2
// Tanggal Pengerjaan: 05 Juni 2021

public class GalleryFragment extends Fragment {

    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        recyclerView = view.findViewById(R.id.rvGallery);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        List<Picture> pictures = new ArrayList<>();

        pictures.add(new Picture(R.drawable.img1));
        pictures.add(new Picture(R.drawable.img2));
        pictures.add(new Picture(R.drawable.im3));
        pictures.add(new Picture(R.drawable.img4));
        pictures.add(new Picture(R.drawable.img5));
        pictures.add(new Picture(R.drawable.img6));

        GalleryAdapter galleryAdapter = new GalleryAdapter(pictures);
        recyclerView.setAdapter(galleryAdapter);
        return view;
    }
}
