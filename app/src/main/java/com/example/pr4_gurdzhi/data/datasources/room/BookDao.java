package com.example.pr4_gurdzhi.data.datasources.room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.pr4_gurdzhi.data.models.BookInfoEntity;

import java.util.List;

@Dao
public interface BookDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long insert(BookInfoEntity film);
    @Query("DELETE FROM book_table")
    void deleteAll();
    @Query("SELECT * FROM book_table ORDER BY id")
    LiveData<List<BookInfoEntity>> getAllFilms();
}
