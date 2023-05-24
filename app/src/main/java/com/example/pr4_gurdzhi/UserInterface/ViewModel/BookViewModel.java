package com.example.pr4_gurdzhi.UserInterface.ViewModel;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.pr4_gurdzhi.data.models.BookInfo;
import com.example.pr4_gurdzhi.data.repositories.BookRepos;
import com.example.pr4_gurdzhi.data.repositories.DataRepos;

import java.util.List;

public class BookViewModel extends AndroidViewModel {
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

    public BookViewModel(@NonNull Application application){
        super(application);
        BookRepos repositBooks = new BookRepos(getApplication().getApplicationContext());
        dataRepos = new DataRepos();

        books = repositBooks.getAllBooks();
    }
}