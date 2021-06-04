package com.hirumi.hirumiapps;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hirumi.hirumiapps.NonRoomEntity.Picture;

import java.util.List;


// Nama: M Hilmy Naufal
// NIM: 10118046
// Kelas: IF-2
// Tanggal Pengerjaan: 05 Juni 2021
public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder> {

    List<Picture> pictures;

    public GalleryAdapter(List<Picture> pictures) {
        this.pictures = pictures;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_list, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Picture picture = pictures.get(position);

        holder.galleryPicture.setImageResource(picture.getId());
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView galleryPicture;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            galleryPicture = itemView.findViewById(R.id.galleryPicture);
        }
    }
}
