package com.example.pr4_gurdzhi.UserInterface.ViewModel;

import android.app.Activity;
import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.pr4_gurdzhi.data.models.BookInfo;
import com.example.pr4_gurdzhi.data.repositories.BookRepos;
import com.example.pr4_gurdzhi.data.repositories.DataRepos;

import java.util.List;

public class BookViewModel extends ViewModel {
    public LiveData<List<BookInfo>> books;
    public DataRepos dataRepos;

    public void createDataInAppSpecific(Context context, String filename, String content){
        dataRepos.createDataInAppSpec(context , filename, content);
    }

    public void createDataInExternal(Activity activity, String filename, String content){
        dataRepos.createDataInExternalStorage(activity, filename, content);
    }

    public void createDataInSharedPreferences(Activity activity, String filename, String content){
        dataRepos.createDataInSharedPreferences(activity, filename, content);
    }

    public BookViewModel(){
        BookRepos repositBooks = new BookRepos();
        dataRepos = new DataRepos();

        books = repositBooks.generateData();
    }
}