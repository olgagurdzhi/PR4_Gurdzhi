package com.example.pr4_gurdzhi.UserInterface;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pr4_gurdzhi.R;


public class BlankFragment5 extends Fragment {


    public BlankFragment5() {
        super(R.layout.fragment_blank5);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank5, container, false);
    }
}