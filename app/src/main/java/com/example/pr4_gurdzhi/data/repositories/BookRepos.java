package com.example.pr4_gurdzhi.data.repositories;

import androidx.lifecycle.LiveData;

import com.example.pr4_gurdzhi.data.datasources.books.BookDataSource;
import com.example.pr4_gurdzhi.data.models.BookInfo;

import java.util.List;

public class BookRepos {
    public LiveData<List<BookInfo>> generateData(){
        return BookDataSource.setInitialData();
    }
}