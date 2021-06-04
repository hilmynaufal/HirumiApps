package com.hirumi.hirumiapps.Room.Entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "daily")
public class Daily {

    // Nama: M Hilmy Naufal
    // NIM: 10118046
    // Kelas: IF-2
    // Tanggal Pengerjaan: 05 Juni 2021

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "drawableID")
    private int drawableID;

    @ColumnInfo(name = "namaAktiftas")
    private String namaAktifitas;

    @ColumnInfo(name = "waktuAktifitas")
    private String waktuAktifitas;

    @ColumnInfo(name = "durasiAktifitas")
    private String durasiAktifitas;

    public Daily() {
    }

    @Ignore
    public Daily(int id, int drawableID, String namaAktifitas, String waktuAktifitas, String durasiAktifitas) {
        this.id = id;
        this.drawableID = drawableID;
        this.namaAktifitas = namaAktifitas;
        this.waktuAktifitas = waktuAktifitas;
        this.durasiAktifitas = durasiAktifitas;
    }

    public Daily(int drawableID, String namaAktifitas, String waktuAktifitas, String durasiAktifitas) {
        this.drawableID = drawableID;
        this.namaAktifitas = namaAktifitas;
        this.waktuAktifitas = waktuAktifitas;
        this.durasiAktifitas = durasiAktifitas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaAktifitas() {
        return namaAktifitas;
    }

    public void setNamaAktifitas(String namaAktifitas) {
        this.namaAktifitas = namaAktifitas;
    }

    public String getWaktuAktifitas() {
        return waktuAktifitas;
    }

    public void setWaktuAktifitas(String waktuAktifitas) {
        this.waktuAktifitas = waktuAktifitas;
    }

    public int getDrawableID() {
        return drawableID;
    }

    public void setDrawableID(int drawableID) {
        this.drawableID = drawableID;
    }

    public String getDurasiAktifitas() {
        return durasiAktifitas;
    }

    public void setDurasiAktifitas(String durasiAktifitas) {
        this.durasiAktifitas = durasiAktifitas;
    }
}
