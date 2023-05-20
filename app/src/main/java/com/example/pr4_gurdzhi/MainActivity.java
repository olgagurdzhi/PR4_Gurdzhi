package com.example.pr4_gurdzhi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.pr4_gurdzhi.UserInterface.BlankFragment;
import com.example.pr4_gurdzhi.UserInterface.BlankFragment2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.nav_host_fragment, BlankFragment.class, null)
                .commit();
    }
}