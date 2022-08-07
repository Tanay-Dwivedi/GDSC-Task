package com.assignment.gdsctaskapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class IntroductionScreen extends AppCompatActivity {

    CardView lgnCard;
    TextView sgnCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_screen);

        // This will remove the action bar
        Objects.requireNonNull(getSupportActionBar()).hide();

        lgnCard = findViewById(R.id.introLoginCard);
        sgnCard = findViewById(R.id.introSignInCard);

        lgnCard.setOnClickListener(view -> {
            Intent intent = new Intent(IntroductionScreen.this, LoginScreen.class);
            startActivity(intent);
        });

        sgnCard.setOnClickListener(view -> {
            Intent intent = new Intent(IntroductionScreen.this, SignUpScreen.class);
            startActivity(intent);
        });

    }
}