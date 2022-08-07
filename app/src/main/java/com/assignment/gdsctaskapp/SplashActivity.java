package com.assignment.gdsctaskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.VideoView;

import java.util.Objects;

public class SplashActivity extends AppCompatActivity {

    VideoView splVdo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // This will display the app in full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // This will remove the action bar
        Objects.requireNonNull(getSupportActionBar()).hide();

        splVdo = findViewById(R.id.splashVideo);

        // this is for the main splash screen video
        String splash_path = "android.resource://" + getPackageName() + "/" + R.raw.splash_screen_video;
        Uri videoSplash = Uri.parse(splash_path);
        splVdo.setVideoURI(videoSplash);
        splVdo.start();
        splVdo.setOnCompletionListener(mediaPlayer -> splVdo.start());

        //calling new activity
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, IntroductionScreen.class);
            startActivity(intent);
            finish();
        }, 3000);


    }
}