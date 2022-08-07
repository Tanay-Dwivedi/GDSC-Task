package com.assignment.gdsctaskapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class SignUpScreen extends AppCompatActivity {

    TextView newLgnText;
    CardView sgnSignUpCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);

        // This will remove the action bar
        Objects.requireNonNull(getSupportActionBar()).hide();

        newLgnText = findViewById(R.id.newLogin);
        sgnSignUpCard = findViewById(R.id.signUpCard);

        newLgnText.setOnClickListener(view -> {
            Intent intent = new Intent(SignUpScreen.this, LoginScreen.class);
            Toast.makeText(SignUpScreen.this, "Welcome back!!", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        });

        sgnSignUpCard.setOnClickListener(view -> {
            Intent intent = new Intent(SignUpScreen.this, WelcomeScreen.class);
            Toast.makeText(SignUpScreen.this, "Successfully SignedIn", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        });

    }
}