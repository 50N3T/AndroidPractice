package com.example.a50n3t.customadapterv_5;

import java.util.ArrayList;

/**
 * Created by 50N3T on 6/29/2016.
 */
public class CountryCollection {

    private String countryName;
    private String countryDetail;
    private int flagId;

    public CountryCollection(String countryName, String countryDetail, int flagId) {
        this.countryName = countryName;
        this.countryDetail = countryDetail;
        this.flagId = flagId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryDetail() {
        return countryDetail;
    }

    public void setCountryDetail(String countryDetail) {
        this.countryDetail = countryDetail;
    }

    public int getFlagId() {
        return flagId;
    }

    public void setFlagId(int flagId) {
        this.flagId = flagId;
    }

    public CountryCollection() {
    }

    public ArrayList<CountryCollection> getAll()
    {
        ArrayList<CountryCollection> collections = new ArrayList<>();

        collections.add(new CountryCollection("China","Asian country",R.drawable.china));
        collections.add(new CountryCollection("England","Non Asian country",R.drawable.england));
        collections.add(new CountryCollection("Germany","Non Asian country",R.drawable.germany));
        collections.add(new CountryCollection("Iran","Non Asian country",R.drawable.iran));
        collections.add(new CountryCollection("Ireland","Non Asian country",R.drawable.ireland));
        collections.add(new CountryCollection("Spain","Non Asian country",R.drawable.spain));
        collections.add(new CountryCollection("United Kingdom","Non Asian country",R.drawable.united_kingdom));

        return collections;
    }

}
