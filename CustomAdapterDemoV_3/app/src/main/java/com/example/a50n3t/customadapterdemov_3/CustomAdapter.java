package com.example.a50n3t.customadapterdemov_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by 50N3T on 6/19/2016.
 */
public class CustomAdapter extends ArrayAdapter <String> {
    private static MainActivity mainActivity;
    private static String[] countryNames;
    private static Integer[] imagesId;




    public CustomAdapter(MainActivity mainActivity, String[] countryNames, Integer[] imagesId) {
        super(mainActivity,R.layout.list_custom,countryNames);

        this.mainActivity = mainActivity;
        this.countryNames = countryNames;
        this.imagesId = imagesId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = mainActivity.getLayoutInflater();
        View view = inflater.inflate(R.layout.list_custom,null,true);

        TextView textView = (TextView) view.findViewById(R.id.textView);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);

        textView.setText(countryNames[position]);
        imageView.setImageResource(imagesId[position]);

        return view;
    }
}
