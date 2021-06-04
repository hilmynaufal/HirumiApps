package com.hirumi.hirumiapps;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hirumi.hirumiapps.Room.Entity.Daily;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

// Nama: M Hilmy Naufal
// NIM: 10118046
// Kelas: IF-2
// Tanggal Pengerjaan: 05 Juni 2021

public class AdapterTest extends RecyclerView.Adapter<AdapterTest.ViewHolder>{

    List<Daily> dailies;

    public AdapterTest(List<Daily> dailies) {
        this.dailies = dailies;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Daily daily = dailies.get(position);

        holder.dailyName.setText(daily.getNamaAktifitas());
        holder.dailyTime.setText(daily.getWaktuAktifitas());
        holder.circleImageView.setImageResource(daily.getDrawableID());
        holder.dailyDuration.setText(daily.getDurasiAktifitas());
    }

    @Override
    public int getItemCount() {
        return dailies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView dailyName, dailyTime, dailyDuration;
        private CircleImageView circleImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            dailyName = itemView.findViewById(R.id.namaDaily);
            dailyTime = itemView.findViewById(R.id.waktuDaily);
            circleImageView = itemView.findViewById(R.id.imgView);
            dailyDuration = itemView.findViewById(R.id.durasi);
        }
    }
}
