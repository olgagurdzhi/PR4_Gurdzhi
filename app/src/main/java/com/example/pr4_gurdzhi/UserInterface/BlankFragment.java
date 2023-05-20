package com.example.pr4_gurdzhi.UserInterface;

import static android.content.ContentValues.TAG;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pr4_gurdzhi.R;

public class BlankFragment extends Fragment {

    private Context context;
    private final int duration = Toast.LENGTH_SHORT;
    private static final String TAG = "BlankFragment";
    public BlankFragment() {
        super(R.layout.fragment_blank);
    }

    ////

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        @SuppressLint("UseCompatLoadingForDrawables")
        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);

            Button button = view.findViewById(R.id.button);
            button.setOnClickListener(view1 -> Navigation.findNavController(view1).navigate(R.id.action_blankFragment_to_blankFragment2));

            Button buttonLib = view.findViewById(R.id.lib_button);
            buttonLib.setOnClickListener(view12 -> Navigation.findNavController(view12).navigate(R.id.action_blankFragment_to_libraryFragment));

            ImageView image = view.findViewById(R.id.bookImage1);
            image.setImageDrawable(getResources().getDrawable(R.drawable.book_svgrepo_com));

        }

    }
}