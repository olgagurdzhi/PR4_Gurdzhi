package com.example.pr4_gurdzhi.data.datasources.devicestorage;

import android.content.Context;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;

public class MyAppSpecificStorage {

    public void createFileAppSpecific(Context context, String fileName, String fileContent) {
        try (FileOutputStream fos = context.openFileOutput(fileName + ".txt", Context.MODE_PRIVATE)) {
            fos.write(fileContent.getBytes());
            Toast.makeText(context, "File created in " + context.getDataDir(), Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
