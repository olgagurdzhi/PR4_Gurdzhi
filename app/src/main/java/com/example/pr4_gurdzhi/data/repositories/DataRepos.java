package com.example.pr4_gurdzhi.data.repositories;

import android.app.Activity;
import android.content.Context;

import com.example.pr4_gurdzhi.data.datasources.devicestorage.MyAppSpecificStorage;
import com.example.pr4_gurdzhi.data.datasources.devicestorage.MyExternalStorage;
import com.example.pr4_gurdzhi.data.datasources.devicestorage.MySharedPreferences;

public class DataRepos {

    MyAppSpecificStorage myAppSpecificStorage;
    MyExternalStorage myExternalStorage;
    MySharedPreferences mySharedPreferences;

    public DataRepos() {
        myAppSpecificStorage = new MyAppSpecificStorage();
        myExternalStorage = new MyExternalStorage();
        mySharedPreferences = new MySharedPreferences();
    }

    public void createDataInAppSpec(Context context, String filename, String content){
        myAppSpecificStorage.createFileAppSpecific(context, filename, content);
    }

    public void createDataInExternalStorage(Activity activity, String filename, String content){
        myExternalStorage.createFileExternal(activity, filename, content);
    }

    public void createDataInSharedPreferences(Activity activity, String filename, String content){
        mySharedPreferences.createFileSharedPreferences(activity, filename, content);
    }

}
