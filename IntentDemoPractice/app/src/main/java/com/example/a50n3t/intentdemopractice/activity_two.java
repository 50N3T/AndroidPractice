package com.example.a50n3t.intentdemopractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_two extends AppCompatActivity {

    TextView txtName;
    TextView txtEmail;
    TextView txtWeb;

    Button backBtn;

    String name;
    String mail;
    String web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_two);

        txtName = (TextView) findViewById(R.id.nameTxt);
        txtEmail = (TextView) findViewById(R.id.emailTxt);
        txtWeb = (TextView) findViewById(R.id.webTxt);

        backBtn = (Button) findViewById(R.id.backBtn);

        name = getIntent().getStringExtra("Name");
        mail = getIntent().getStringExtra("Email");
        web = getIntent().getStringExtra("Web");

        txtName.setText(name);
        txtEmail.setText(mail);
        txtWeb.setText(web);

    }

    public void backMethod(View view) {

        Intent backIntent = new Intent(this,MainActivity.class);
        startActivity(backIntent);
    }
}
