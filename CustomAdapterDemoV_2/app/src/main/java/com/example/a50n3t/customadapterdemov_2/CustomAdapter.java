package com.example.a50n3t.customadapterdemov_2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;


public class CustomAdapter extends ArrayAdapter <String> {

    private final Activity context;
    private final String[] countryName;
    private final Integer[] imageId;


    public CustomAdapter(Activity context, String[] countryName, Integer[] imageId) {
        super(context, R.layout.list_item, countryName);
        this.context = context;
        this.countryName = countryName;
        this.imageId = imageId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rawView = inflater.inflate(R.layout.list_item,null,true);

        TextView textView = (TextView) rawView.findViewById(R.id.textView);
        ImageView imageView = (ImageView) rawView.findViewById(R.id.imageView);

        textView.setText(countryName[position]);
        imageView.setImageResource(imageId[position]);

        return rawView;
    }
}
