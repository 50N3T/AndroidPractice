package com.example.a50n3t.customadapterdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {
    ListView list;
    String[] web = {
            "China",
            "England",
            "Germany",
            "Iran",
            "Ireland",
            "Spain",
            "United Kingdom"
    } ;
    Integer[] imageId = {
            R.drawable.china,
            R.drawable.england,
            R.drawable.germany,
            R.drawable.iran,
            R.drawable.ireland,
            R.drawable.spain,
            R.drawable.united_kingdom
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomList adapter = new
                CustomList(MainActivity.this, web, imageId);

        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }

}