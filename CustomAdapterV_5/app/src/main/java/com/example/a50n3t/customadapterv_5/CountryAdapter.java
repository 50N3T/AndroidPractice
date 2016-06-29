package com.example.a50n3t.customadapterv_5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 50N3T on 6/29/2016.
 */
public class CountryAdapter extends ArrayAdapter<CountryCollection> {

    private ArrayList<CountryCollection> collection;
    private Context context;

    public CountryAdapter(Context context, ArrayList<CountryCollection> collection) {
        super(context, R.layout.custom_layout, collection);

        this.collection = collection;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.custom_layout,null,true);

        TextView getCountryName = (TextView) convertView.findViewById(R.id.countryName);
        TextView getCountryDetails = (TextView) convertView.findViewById(R.id.countryDetails);
        ImageView getImageId = (ImageView) convertView.findViewById(R.id.imageView);

        getImageId.setImageResource(collection.get(position).getFlagId());
        getCountryName.setText(collection.get(position).getCountryName());
        getCountryDetails.setText(collection.get(position).getCountryDetail());

        return convertView;
    }
}
