package com.example.a50n3t.intentdemopractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtName;
    EditText txtMail;
    EditText txtWeb;

    Button sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = (EditText) findViewById(R.id.txtName);
        txtMail = (EditText) findViewById(R.id.txtMail);
        txtWeb = (EditText) findViewById(R.id.txtWeb);

        sendBtn = (Button) findViewById(R.id.sendBtn);

    }

    public void sendMethod(View view) {

        String getName = txtName.getText().toString();
        String getMail = txtMail.getText().toString();
        String getWeb = txtWeb.getText().toString();

        Intent sendIntent = new Intent(this,activity_two.class);

        sendIntent.putExtra("Name",getName);
        sendIntent.putExtra("Email",getMail);
        sendIntent.putExtra("Web",getWeb);

        startActivity(sendIntent);


    }
}
