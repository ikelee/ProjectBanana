package com.example.ike.banana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Driving extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driving);
    }

    public void movetoendtrip(View v) {
        Intent i = new Intent();
        i.setClass(this, EndTrip.class);
        startActivity(i);
    }

    public void movetoEG(View v) {
        Intent i = new Intent();
        i.setClass(this, Emergency.class);
        startActivity(i);
    }
}
