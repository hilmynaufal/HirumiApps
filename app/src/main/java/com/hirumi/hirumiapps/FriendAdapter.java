package com.hirumi.hirumiapps;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hirumi.hirumiapps.NonRoomEntity.Friend;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

// Nama: M Hilmy Naufal
// NIM: 10118046
// Kelas: IF-2
// Tanggal Pengerjaan: 05 Juni 2021

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.ViewHolder> {

    List<Friend> friendList;

    public FriendAdapter(List<Friend> friendList) {
        this.friendList = friendList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.friend_list, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Friend friend = friendList.get(position);

        holder.foto.setImageResource(friend.getFoto());
        holder.nama.setText(friend.getNama());
        holder.pekerjaan.setText(friend.getPekerjaan());
    }

    @Override
    public int getItemCount() {
        return friendList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nama, pekerjaan;
        private CircleImageView foto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.namaFriend);
            pekerjaan = itemView.findViewById(R.id.pekerjaanFriend);
            foto = itemView.findViewById(R.id.gambarFriend);
        }
    }
}
