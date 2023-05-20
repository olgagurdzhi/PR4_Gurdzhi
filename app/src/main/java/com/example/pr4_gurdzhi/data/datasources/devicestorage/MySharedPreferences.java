package com.example.pr4_gurdzhi.data.datasources.devicestorage;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

public class MySharedPreferences {

    public void createFileSharedPreferences(Context context, String fileName, String fileContent) {
        SharedPreferences settings = context.getSharedPreferences(fileName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString( "loginInfo", fileContent);
        editor.apply();
        Toast.makeText(context, "File created in " + settings + fileName, Toast.LENGTH_SHORT).show();
    }

}
