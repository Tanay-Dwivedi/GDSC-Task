package com.assignment.gdsctaskapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class LoginScreen extends AppCompatActivity {

    TextView recTxt, rgsTxt;
    CardView lgnLoginCard;
    View google, apple, facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        // This will remove the action bar
        Objects.requireNonNull(getSupportActionBar()).hide();

        recTxt = findViewById(R.id.recoveryPasswordTxt);
        rgsTxt = findViewById(R.id.registerText);
        lgnLoginCard = findViewById(R.id.loginCard);
        google = findViewById(R.id.loginWithGoogle);
        apple = findViewById(R.id.loginWithApple);
        facebook = findViewById(R.id.loginWithFacebook);

        recTxt.setOnClickListener(view -> Toast.makeText(LoginScreen.this, "Reset Password link has been sent to your email address", Toast.LENGTH_SHORT).show());

        rgsTxt.setOnClickListener(view -> {
            Intent intent = new Intent(LoginScreen.this, SignUpScreen.class);
            Toast.makeText(LoginScreen.this, "Welcome to the registration!", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        });

        lgnLoginCard.setOnClickListener(view -> {
            Intent intent = new Intent(LoginScreen.this, WelcomeScreen.class);
            Toast.makeText(LoginScreen.this, "Login Successful", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        });

        google.setOnClickListener(view -> {
            Intent intent = new Intent(LoginScreen.this, WelcomeScreen.class);
            Toast.makeText(LoginScreen.this, "Successfully logged in with Google", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        });

        apple.setOnClickListener(view -> {
            Intent intent = new Intent(LoginScreen.this, WelcomeScreen.class);
            Toast.makeText(LoginScreen.this, "Successfully logged in with Apple", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        });

        facebook.setOnClickListener(view -> {
            Intent intent = new Intent(LoginScreen.this, WelcomeScreen.class);
            Toast.makeText(LoginScreen.this, "Successfully logged in with Facebook", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        });

    }
}