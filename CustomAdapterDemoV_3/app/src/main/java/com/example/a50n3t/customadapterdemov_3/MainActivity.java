package com.example.a50n3t.customadapterdemov_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] countryNames = {
                              "China",
                              "England",
                              "Germany",
                              "Iran",
                              "Ireland",
                              "Spain",
                              "United Kingdom"};

    Integer[] imagesId = {
                           R.drawable.china,
                           R.drawable.england,
                           R.drawable.germany,
                           R.drawable.iran,
                           R.drawable.ireland,
                           R.drawable.spain,
                           R.drawable.united_kingdom,
                          };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        CustomAdapter adapter = new CustomAdapter(MainActivity.this,countryNames,imagesId);



    }
}
