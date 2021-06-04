package com.hirumi.hirumiapps.Room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.hirumi.hirumiapps.Room.Entity.Daily;

import java.util.List;

@Dao
public interface DailyDAO {

    // Nama: M Hilmy Naufal
    // NIM: 10118046
    // Kelas: IF-2
    // Tanggal Pengerjaan: 05 Juni 2021
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void saveAll (List<Daily> dailies);

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void save (Daily daily);

    @Update
    void update(Daily daily);

    @Delete
    void delete(Daily daily);

    @Query("select * from daily")
    List<Daily> findAll();

    @Query("DELETE FROM daily")
    void deleteAll();

    @Query("SELECT COUNT(*) FROM daily")
    int size();
}
