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
import com.hirumi.hirumiapps.NonRoomEntity.Friend;
import com.hirumi.hirumiapps.R;

import java.util.ArrayList;
import java.util.List;

// Nama: M Hilmy Naufal
// NIM: 10118046
// Kelas: IF-2
// Tanggal Pengerjaan: 05 Juni 2021

public class FriendsFragment extends Fragment {

    private RecyclerView recyclerView;
    View v;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_friend, container, false);

        recyclerView = v.findViewById(R.id.rvFriend);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false));

        List<Friend> friends = new ArrayList<>();

        friends.add(new Friend("Hendra", "Mahasiswa", R.drawable.hendra));
        friends.add(new Friend("Dodo", "Pekerja", R.drawable.dodo));
        friends.add(new Friend("Naufal CS", "Pujangga", R.drawable.cs));
        friends.add(new Friend("Sasha", "Atlit", R.drawable.sasha));
        friends.add(new Friend("Haachama", "VTuber", R.drawable.haachama));

        FriendAdapter friendAdapter = new FriendAdapter(friends);
        recyclerView.setAdapter(friendAdapter);

        Log.d("test", String.valueOf(friendAdapter.getItemCount()));

        return v;
    }
}
