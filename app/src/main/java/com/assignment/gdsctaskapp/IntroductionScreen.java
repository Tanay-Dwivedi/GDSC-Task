package com.assignment.gdsctaskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class IntroductionScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_screen);

        // This will remove the action bar
        Objects.requireNonNull(getSupportActionBar()).hide();


    }
}