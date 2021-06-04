package com.hirumi.hirumiapps.NonRoomEntity;

public class Friend {

    // Nama: M Hilmy Naufal
    // NIM: 10118046
    // Kelas: IF-2
    // Tanggal Pengerjaan: 05 Juni 2021
    private String nama, pekerjaan;
    private int foto;

    public Friend() {
    }

    public Friend(String nama, String pekerjaan, int foto) {
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
