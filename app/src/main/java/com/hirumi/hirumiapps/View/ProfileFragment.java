package com.hirumi.hirumiapps.View;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.hirumi.hirumiapps.R;

import java.net.URI;

import de.hdodenhof.circleimageview.CircleImageView;

// Nama: M Hilmy Naufal
// NIM: 10118046
// Kelas: IF-2
// Tanggal Pengerjaan: 05 Juni 2021

public class ProfileFragment extends Fragment implements OnMapReadyCallback {
    private ImageButton setting;
    private CircleImageView yt, fb, wa, email;
    private GoogleMap uniMap;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        yt = view.findViewById(R.id.yt_icon);
        fb = view.findViewById(R.id.fb_icon);
        wa = view.findViewById(R.id.wa_icon);
        email = view.findViewById(R.id.email_icon);
        setting = view.findViewById(R.id.setting);

        yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/channel/UCn6KB4NDGbID3kPqNTp4fDw";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.youtube.com/channel/UCn6KB4NDGbID3kPqNTp4fDw";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "tel:+6285294731464";
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SENDTO);
                i.setData(Uri.parse("mailto:"));
                i.putExtra(Intent.EXTRA_EMAIL, "hilmyblaze@gmail.com");
                startActivity(i);
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("About");
                builder.setMessage("Version: 0.1 BETA");
                builder.setCancelable(true);

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.main_branch_map);
        mapFragment.getMapAsync(this);

        return view;


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        uniMap = googleMap;
        LatLng UCA = new LatLng(-7.02611, 107.551310);
        uniMap.addMarker(new MarkerOptions().position(UCA).title("M Hilmy Naufal")).showInfoWindow();

        uniMap.animateCamera(CameraUpdateFactory.newLatLngZoom(UCA,18));
    }
}
