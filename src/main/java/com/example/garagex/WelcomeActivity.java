package com.example.garagex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {
    private Button welcomedriverbutton;
    private Button welcomecustomerbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        welcomedriverbutton = (Button) findViewById(R.id.welcomdriverbuton);
        welcomecustomerbutton = (Button) findViewById(R.id.welcomcustomerbutton);

        welcomedriverbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logindriverintent = new Intent(WelcomeActivity.this,DriverloginActivity.class);
                startActivity(logindriverintent);
            }
        });

        welcomecustomerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logincustomerintent = new Intent(WelcomeActivity.this,CoustomerActivity.class);
                startActivity(logincustomerintent);
            }
        });
    }
}