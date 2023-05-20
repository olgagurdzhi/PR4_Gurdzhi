package com.example.pr4_gurdzhi.UserInterface;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pr4_gurdzhi.R;
import com.example.pr4_gurdzhi.data.models.BookInfo;

import java.util.List;

public class BookAdapter extends ArrayAdapter<BookInfo> {

    private LayoutInflater inflater;
    private int layout;
    private List<BookInfo> book;
    private Context context;

    public BookAdapter(Context context, int resource, List<BookInfo> book) {
        super(context, resource, book);
        this.book = book;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        ImageView picView = view.findViewById(R.id.pic);
        TextView nameView = view.findViewById(R.id.name);


        BookInfo state = book.get(position);

        picView.setImageResource(state.getPictureResource());
        nameView.setText(state.getName());

        return view;
    }
}

