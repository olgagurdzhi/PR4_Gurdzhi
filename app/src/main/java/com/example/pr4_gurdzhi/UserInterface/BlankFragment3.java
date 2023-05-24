package com.example.pr4_gurdzhi.UserInterface;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.pr4_gurdzhi.R;
import com.example.pr4_gurdzhi.data.models.BookInfo;

import java.util.ArrayList;

    public class BlankFragment3 extends Fragment {
        private Context context;
        private final int duration = Toast.LENGTH_SHORT;

        private static final String TAG = "BlankFragment3";
        public BlankFragment3() {
            super(R.layout.fragment_blank3);
        }



        @Nullable
        @Override

            public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
                return inflater.inflate(R.layout.fragment_blank3, container, false);
            }


                ArrayList<BookInfo> books = new ArrayList<BookInfo>();
                ListView countriesList;
                //@Override
                public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
                    super.onViewCreated(view, savedInstanceState);
                    //view.setContentView(R.layout.fragment_blank3);

                    countriesList = view.findViewById(R.id.bookList1);

                    BookAdapter bookAdapter = new BookAdapter(getContext(), R.layout.list_item, books);

                    countriesList.setAdapter(bookAdapter);
                    AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                            Navigation.findNavController(view).navigate(R.id.action_blankFragment3_to_blankFragment2);
                        }
                    };
                    countriesList.setOnItemClickListener(itemListener);
                }





            }