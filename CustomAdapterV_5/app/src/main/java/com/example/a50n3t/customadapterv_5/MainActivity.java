package com.example.a50n3t.customadapterv_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<CountryCollection> mainCollection;
    CountryAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        CountryCollection collectionMain = new CountryCollection();
        mainCollection = collectionMain.getAll();

        mainAdapter = new CountryAdapter(this,mainCollection);
        listView.setAdapter(mainAdapter);

    }
}
