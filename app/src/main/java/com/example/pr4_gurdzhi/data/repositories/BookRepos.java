package com.example.pr4_gurdzhi.data.repositories;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;

import com.example.pr4_gurdzhi.data.datasources.books.BookDataSource;
import com.example.pr4_gurdzhi.data.datasources.room.BookDao;
import com.example.pr4_gurdzhi.data.datasources.room.BookInfoRoomDatabase;
import com.example.pr4_gurdzhi.data.models.BookInfo;
import com.example.pr4_gurdzhi.data.models.BookInfoEntity;

import java.util.List;
import java.util.stream.Collectors;

public class BookRepos {

    private final BookDao mFilmDao;
    private final LiveData<List<BookInfo>> mAllBooks;

    private final Context context;

    BookInfoRoomDatabase roomDatabase;
    public BookRepos(Context applicationContext) {
        context = applicationContext;
        roomDatabase = BookInfoRoomDatabase.getDatabase(context);
        mFilmDao = BookInfoRoomDatabase.getDatabase(context).bookDao();
        mAllBooks = Transformations.map(mFilmDao.getAllFilms(), entities -> entities.stream().map(BookInfoEntity::toBookInfo).collect(Collectors.toList()));
    }
    public LiveData<List<BookInfo>> getAllBooks() {
        return mAllBooks;
    }
    public LiveData<List<BookInfo>> generateData(){
        return BookDataSource.setInitialData();
    }
}