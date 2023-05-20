package com.example.pr4_gurdzhi.data.datasources.devicestorage;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyExternalStorage {

    private static final int REQUEST_EXTERNAL_STORAGE = 1;

    public void createFileExternal(Activity activity, String fileName, String fileContent) {
        Context context = activity.getApplicationContext();
        if (context.getApplicationContext().checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
            File filePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            File file = new File(filePath, fileName + ".txt");
            FileOutputStream outputStream;
            try {
                outputStream = new FileOutputStream(file);
                outputStream.write(fileContent.getBytes());
                Toast.makeText(context, "File created in " + filePath + fileName + ".txt", Toast.LENGTH_SHORT).show();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            ActivityCompat.requestPermissions(activity, new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    REQUEST_EXTERNAL_STORAGE);
        }
    }


}
