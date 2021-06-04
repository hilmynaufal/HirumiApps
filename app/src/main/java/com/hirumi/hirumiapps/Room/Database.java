package com.hirumi.hirumiapps.Room;

import androidx.room.RoomDatabase;

import com.hirumi.hirumiapps.Room.Entity.Daily;

@androidx.room.Database(entities = {Daily.class}, version = 1)
public abstract class Database extends RoomDatabase {

    // Nama: M Hilmy Naufal
    // NIM: 10118046
    // Kelas: IF-2
    // Tanggal Pengerjaan: 05 Juni 2021
    public abstract DailyDAO dailyDAO();
}
