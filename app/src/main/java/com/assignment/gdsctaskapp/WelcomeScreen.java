package com.assignment.gdsctaskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class WelcomeScreen extends AppCompatActivity {

    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        image = findViewById(R.id.welcomeImg);

        image.setOnClickListener(view -> Toast.makeText(WelcomeScreen.this, "Hello, This is the GDSC Task App", Toast.LENGTH_SHORT).show());

    }
}